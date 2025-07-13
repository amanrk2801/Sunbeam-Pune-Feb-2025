#include <stdio.h>

int sunbeam( void   )
{
	int a = 3;
	return a * a;
}

int main() 
{
	int a = 5;
	printf("%d\n", sunbeam(a,a,a));
	return 0;
}

