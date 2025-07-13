#!/bin/bash

# count number of executable files in given directory.

echo -n "enter dir path: "
read dirpath

if [ -d $dirpath ]
then
	cd $dirpath
	count=0
	for file in `ls`
	do
		if [ -f $file -a -x $file ]
		then
			count=`expr $count + 1`
		fi
	done
	echo "Executable Files Count: $count"
else
	echo "Invalid Dir Path"
fi

