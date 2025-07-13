#!/bin/bash

# array indices starts from zero (like C/Java)
# optional array declaration: declare -a arrname
# initialize array: arr=(e1 e2 e3 e4)
# list of elements in array: ${arr[*]} -- can be used with foreach loop
# to access ith element of array: ${arr[i]}
# to assign ith element of array: arr[$i]=value
# count of array elements: ${#arr[*]}

# simple array demo
arr1=(11 22 33 44 55)

for val in ${arr1[*]}
do
	echo "arr1 element: $val"
done

echo "count of elems in arr1: ${#arr1[*]}"
echo "2nd elem in arr1: ${arr1[2]}"

# input 5 numbers from user, store in array, add them and display result
declare -a arr2
echo "Enter array elements: "
for((i=0; i<5; i++))
do
	read arr2[$i]
done

sum=0
for((i=0; i<5; i++))
do
	sum=`expr $sum + ${arr2[i]}`
done
echo "Sum of Elems: $sum"

