#!/bin/bash

# function fn_name()
# {
#	... access args using $1 $2 $3 ...
#	echo "$result"
# }

## call function and display result on terminal
# fn_name arg1 arg2 arg3

## call function and collect result in a var
# res=`fn_name arg1 arg2 arg3`
# res=$(fn_name arg1 arg2 arg3)

# write function for addition of two numbers
function add()
{
	r=`expr $1 + $2`
	echo "$r"
}

# call fn and display result on terminal
add 10 20

# call fn and collect result in variable
res=$(add 11 22)
echo "add result: $res"


