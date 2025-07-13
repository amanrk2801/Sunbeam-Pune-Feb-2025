#!/bin/bash

# $? -- exit status of last executed program
#	0 indicate success, and non-zero indicate failure

# run this script using "sudo".

pkgs=(vim openjdk-11-jdk valgrind gcc)

for pkg in ${pkgs[*]}
do
	apt -y install $pkg
	if [ $? -ne 0 ]
	then
		echo "Failed to install: $pkg"
		exit
	else
		echo "Successully installed: $pkg"
	fi
done


