#!/bin/bash
MSG="${@}"

{ ./update.sh "$MSG"; } || exit 1

git checkout master && git pull origin dev

git push

git checkout dev && git branch -u origin/dev
