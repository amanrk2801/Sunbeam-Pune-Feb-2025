#!/bin/bash

# program to calc area of rectangle.

# variables in shell script
#	No data types, No declaration
# Assign value to variable
#	var=value
# To access value of variable prefix with $
#	echo $var
# To input var from end user use "read" command.
#	read var

# to assign output of a command to a variable
#	var=`command`

echo -n "enter length: "
read len
echo -n "enter breadth: "
read br

area=`expr $len \* $br`
echo "area of rect: $area"

