#!/bin/bash
MSG="${@}"
if [[ $MSG == "" ]]; then
	printf "Please supply a message after the command"
	exit 1
fi

{ ./gradlew build && git add . && git commit -m"$MSG" && git push origin dev; } || printf ERROR: Task failed, not pushing.
