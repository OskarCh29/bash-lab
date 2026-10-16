#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
BUILD_DIR="$(mktemp -d)"
PROFILE_PID=""
TASK_PID=""

cleanup() {
  if [[ -n "$TASK_PID" ]]; then
    kill "$TASK_PID" 2>/dev/null || true
    wait "$TASK_PID" 2>/dev/null || true
  fi
  if [[ -n "$PROFILE_PID" ]]; then
    kill "$PROFILE_PID" 2>/dev/null || true
    wait "$PROFILE_PID" 2>/dev/null || true
  fi
  rm -rf "$BUILD_DIR"
}
trap cleanup EXIT

mkdir -p "$BUILD_DIR/profile" "$BUILD_DIR/task"
javac --add-modules jdk.httpserver -d "$BUILD_DIR/profile" \
  "$ROOT_DIR/course/fixtures/apps/profile-api/ProfileApi.java"
javac --add-modules jdk.httpserver -d "$BUILD_DIR/task" \
  "$ROOT_DIR/course/fixtures/apps/task-api/TaskApi.java"

PORT=18081 java --add-modules jdk.httpserver -cp "$BUILD_DIR/profile" ProfileApi \
  >"$BUILD_DIR/profile.log" 2>&1 &
PROFILE_PID=$!
PORT=18080 PROFILE_API_URL=http://127.0.0.1:18081 \
  java --add-modules jdk.httpserver -cp "$BUILD_DIR/task" TaskApi \
  >"$BUILD_DIR/task.log" 2>&1 &
TASK_PID=$!

wait_for_health() {
  local url="$1"
  for _ in $(seq 1 30); do
    if curl --silent --show-error --fail "$url" >/dev/null 2>&1; then
      return 0
    fi
    sleep 1
  done
  echo "Service did not become healthy: $url" >&2
  echo "--- profile-api log ---" >&2
  cat "$BUILD_DIR/profile.log" >&2 || true
  echo "--- task-api log ---" >&2
  cat "$BUILD_DIR/task.log" >&2 || true
  return 1
}

wait_for_health "http://127.0.0.1:18081/health"
wait_for_health "http://127.0.0.1:18080/health"

profile_body="$(curl --silent --show-error --fail http://127.0.0.1:18081/api/profiles/1)"
task_body="$(curl --silent --show-error --fail http://127.0.0.1:18080/api/tasks)"
owner_body="$(curl --silent --show-error --fail http://127.0.0.1:18080/api/tasks/with-owner)"

python - "$profile_body" "$task_body" "$owner_body" <<'PY'
import json
import sys

profile = json.loads(sys.argv[1])
tasks = json.loads(sys.argv[2])
with_owner = json.loads(sys.argv[3])

assert profile["id"] == 1, "profile-api fixture returned an unexpected profile"
assert tasks and tasks[0]["id"] == 1, "task-api fixture returned unexpected tasks"
assert with_owner["owner"]["id"] == 1, "task-api could not retrieve the profile upstream"
print("OK: both REST fixtures are healthy and task-api can call profile-api.")
PY
