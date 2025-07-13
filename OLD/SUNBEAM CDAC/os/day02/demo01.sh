#!/bin/bash

# shell script is collection of commands along with programming constructs.
# shell script is executed by shell program e.g. bash.

# first line of shell script should be path of shell program prefixed by #!.
# it informs OS that given shell program is used to execute this shell script.
# this must be first line of the script -- called as "shebang line".

# if shebang is missing,
# option1: user must specify shell program that should execute the script.
#	terminal> bash demo01.sh
# option2: if script executed directly, it will be executed by current shell program.
#	terminal> chmod +x demo01.sh
#	terminal> ./demo01.sh

# comments in shell script starts with #.

echo "My Shell: $SHELL"

echo "My Name: $USER"

echo "My Home: $HOME"

echo "Word Count of ls"
ls -l $HOME | wc

ncal

echo "My Machine: "
hostname

