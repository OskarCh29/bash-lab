#!/usr/bin/env sh
set -eu

echo "$DOCKERHUB_PASSWORD" | docker login -u "$DOCKERHUB_USERNAME" --password-stdin

tag="${GITHUB_REF_NAME}-${GITHUB_RUN_NUMBER}"

image="${DOCKER_REPO}:${tag}"

docker build -t "$image" .
docker push "$image"
