#!/bin/bash

# input a month from user and display number of days in it.

# case $var in
# c1)
#	...
#	;;
# c2|const2)
#	...
#	;;
# *)
#	...
# esac

echo -n "enter a month: "
read m

m=`echo "$m" | tr "A-Z" "a-z"`

case $m in
1|jan|january)
	echo "Jan has 31 days"
	;;
2|feb|february)
	echo "Feb has 28 days"
	;;
3|mar|march)
	echo "Mar has 31 days"
	;;
4|apr|april)
	echo "Apr has 30 days"
	;;
*)
	echo "I don't know"
esac




