#!/bin/bash

# store pos params in an array variable
args=("$*")

echo "before shift..."
echo "arg1 = $1"
echo "arg2 = $2"
echo "arg3 = $3"

# discard first 3 variables
shift 3

echo "after shift..."
echo "arg1 = $1"
echo "arg2 = $2"
echo "arg3 = $3"

echo "doing unshift..."
# reset the pos params back to the old args saved in args var
set $args

echo "after unshift..."
echo "arg1 = $1"
echo "arg2 = $2"
echo "arg3 = $3"

