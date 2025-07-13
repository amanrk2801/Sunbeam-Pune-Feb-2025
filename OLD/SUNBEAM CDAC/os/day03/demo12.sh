#!/bin/bash

# ./script.sh arg1 arg2 arg3 arg4
#	called as "positional parameters" or "command line args".
# $0 -- current script name
# $# -- param count (except script name)
# $1, $2, ..., $9 -- param1, param2, ..., param9 values
# $* -- collection of all args

# add two numbers given on command line and display result
if [ $# -lt 2 ]
then
	echo "insufficient params (at least two args compulsory)"
	echo "syntax: $0 num1 num2 ..."
	exit
fi
res=`expr $1 + $2`
echo "Sum of two numbers: $res"

# add all numbers given on command line and display result
echo "Count of params: $#"
sum=0
for num in $*
do
	sum=`expr $sum + $num`
done
echo "Sum of all numbers: $sum"

# print arg 10, 11 and 12
# "shift n" command discards first n params and further params are renamed accordingly.
# e.g. after "shift 9" param 1 to 9 are discarded, and param10 renamed as $1, param11 renamed as $2, so on.
shift 9
echo "Param 10 = $1"
echo "Param 11 = $2"
echo "Param 12 = $3"


