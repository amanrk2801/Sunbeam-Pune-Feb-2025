#!/bin/bash

# print table of given number

# -- while loop is repeated until condition is false
# while [ condition ]
# do
#	...
# done

# -- until loop is repeated until condition is true
# until [ condition ]
# do
#	...
# done

# -- for loop is repeated once for each element in collection -- foreach loop
# for var in collection
# do
#	...
# done

# also "break" and "continue" keywords work similar to C/Java.

echo -n "enter a number: "
read num

i=1
while [ $i -le 10 ]
do
	res=`expr $num \* $i`
	echo "while -- $num * $i = $res"
	i=`expr $i + 1`
done

i=1
until [ $i -gt 10 ]
do
	res=`expr $num \* $i`
	echo "until -- $num * $i = $res"
	i=`expr $i + 1`
done

for i in 1 2 3 4 5 6 7 8 9 10
do
	res=`expr $num \* $i`
	echo "foreach -- $num * $i = $res"	
done

for((i=1; i<=10; i++))
do
	res=`expr $num \* $i`
	echo "for -- $num * $i = $res"	
done





