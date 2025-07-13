#!/bin/bash

# input a path from user.
# if it is a file, display its contents.
# if it is a directory, long list it.
# if path not valid, raise error

# file conditions are checked using "test" command.
#	-f: check if file
#	-d: check if directory
#	-e: check if path exists
#	-r: file has read permission
#	-w: file has write permission
#	-x: file has execute permission

echo -n "enter a path: "
read path

if [ -e $path ]
then
	if [ -d $path ]
	then
		ls -l $path
	elif [ -f $path ]
	then
		cat $path
	else
		echo "Neither file nor directory"
	fi
else
	echo "invalid path"
fi

