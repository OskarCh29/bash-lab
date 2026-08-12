#!/bin/sh

info () {
  echo "[INFO] $1: $($2)"
}

title() {
  echo "=============================="
  echo "      SYSTEM INFORMATION"
  echo "=============================="
}

title
info Hostname hostname
info User whoami
info OS "uname -s"
info Kernel "uname -a"
info "Current directory" pwd

