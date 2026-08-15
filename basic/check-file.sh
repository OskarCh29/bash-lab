#!/bin/sh

title () {
echo ===============
echo FILE ANALYZER
echo ===============
}

file_info () {
  title
  echo File: "$1"
  echo Path: "$(realpath "$1")"
  echo Type: "$(file "$1" -b)"
  echo Size: "$(wc -c < "$1") bytes"
  echo Lines: "$(wc -l < "$1")"
  echo Words: "$(wc -w < "$1")"
  echo Characters: "$(wc -m < "$1")"

  echo Last modified: "$(date -r "$1" "+%m-%d-%Y %H:%M:%S" )"

}

validate_options () {
  if [ "$1" -ne 1 ]; then
    echo "Invalid parameter input"
    exit 1
  elif [ "$2" = "-v" ]; then
    echo "[INFO] version: 1.0.0"
    exit 0
    fi
}

validate_input () {
    scriptInput="$1"
    message="$2"

    if [ "$scriptInput" -ne 1 ]; then
        echo "$message"
        exit "$3"
    fi
}

validate_file () {
  file="$1"
  if [ ! -f "$file" ]; then
    echo "[INFO] File not found"
    exit "$2"
  fi
}
input=$#
error_code=1
file=$1
validate_options "$input" "$1"
validate_input "$input" "[INFO] Usage: $(basename "$0") <file>" 2
echo "Checking file..."
sleep 2
validate_file "$file" "$error_code"
file_info "$file"






