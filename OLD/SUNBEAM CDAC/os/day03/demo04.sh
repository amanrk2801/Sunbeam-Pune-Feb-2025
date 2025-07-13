#!/bin/bash

# if bill amount is more than 5000, then give discount of 5%

# int comparison internally done using "test" command
#	-eq, -ne, -gt, -lt, -ge, -le
# logical operators
#	-a, -o, !

# conditions are written in [ ... ] and evaluated using "test" command

echo "enter bill amount: "
read amount

if [ $amount -gt 5000 ]
then
	disc=`echo "$amount * 0.05" | bc`
	amount=`echo "$amount - $disc" | bc`
fi

echo "final bill: $amount"

