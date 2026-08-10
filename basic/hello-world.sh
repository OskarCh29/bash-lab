#!/bin/sh

info() {
  echo "[INFO] $1"
  sleep "$2"
}

info "Starting first script..." 3
rm -f hello.txt

info "Running first appending to file tee -a hello.txt..." 2

info "Hello world! It is my first script!" 3 | tee -a hello.txt

info "Appending new line using >> hello.txt..." 0

info "It is caused due to >> operator and adding lines" 2 >> hello.txt