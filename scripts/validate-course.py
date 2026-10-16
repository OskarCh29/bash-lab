#!/usr/bin/env python3
"""Validate metadata and required sections for course quests."""
from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parents[1]
TASK_ROOT = ROOT / "course" / "lessons"
FIELDS = ("id", "title", "module", "level", "duration_minutes", "requires", "deliverable")
HEADINGS = ("## Misja", "## Cel nauki", "## Zadania", "## Kryteria zaliczenia", "## Weryfikacja", "## Podpowiedzi", "## Raport po zadaniu", "## Porządkowanie")

def front_matter(text):
    if not text.startswith("---\n"):
        return None
    parts = text.split("---", 2)
    if len(parts) != 3:
        return None
    data = {}
    for line in parts[1].splitlines():
        match = re.match(r"^([a-z_]+):\s*(.*?)\s*$", line)
        if match:
            data[match.group(1)] = match.group(2).strip('"')
    return data

def main():
    tasks = sorted(TASK_ROOT.rglob("task.md")) if TASK_ROOT.exists() else []
    errors, seen = [], set()
    if not tasks:
        errors.append("No task.md files found.")
    for path in tasks:
        rel, text = path.relative_to(ROOT), path.read_text(encoding="utf-8")
        meta = front_matter(text)
        if meta is None:
            errors.append(f"{rel}: missing/malformed front matter")
            continue
        for field in FIELDS:
            if not meta.get(field):
                errors.append(f"{rel}: missing field {field}")
        qid = meta.get("id", "")
        if not re.fullmatch(r"T-\d{4}", qid):
            errors.append(f"{rel}: ID must use T-0001 format")
        if qid in seen:
            errors.append(f"{rel}: duplicate ID {qid}")
        seen.add(qid)
        if meta.get("module") != path.parents[1].name:
            errors.append(f"{rel}: module does not match folder")
        try:
            if not 1 <= int(meta.get("level", "0")) <= 4:
                errors.append(f"{rel}: level must be 1-4")
        except ValueError:
            errors.append(f"{rel}: level must be integer")
        try:
            if not 10 <= int(meta.get("duration_minutes", "0")) <= 45:
                errors.append(f"{rel}: duration_minutes must be 10-45")
        except ValueError:
            errors.append(f"{rel}: duration_minutes must be integer")
        for heading in HEADINGS:
            if heading not in text:
                errors.append(f"{rel}: missing heading {heading}")
    if errors:
        print("Course validation failed:")
        for error in errors:
            print("- " + error)
        return 1
    print(f"OK: {len(tasks)} quests validated; IDs unique and required sections present.")
    return 0

if __name__ == "__main__":
    sys.exit(main())
