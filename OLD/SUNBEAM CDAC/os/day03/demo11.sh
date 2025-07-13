#!/bin/bash

# input two strings and check if they are equal or not
# concat two strings and display result
# input a string and check if string is empty or not

echo -n "enter first string: "
read str1
echo -n "enter second string: "
read str2

# man test
if [ $str1 = $str2 ]
then
	echo "Both strings are same"
else
	echo "Both strings are different"
fi

result="$str1 $str2"
echo "Concatenated strings: $result"

echo -n "Enter third string: "
read str3

# man test
if [ -n $str3 ]
then
	echo "String is Not Empty"
else
	echo "String is Empty"
fi

