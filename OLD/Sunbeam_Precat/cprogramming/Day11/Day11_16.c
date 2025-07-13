#include<stdio.h>
int main( void )
{
const int a = 4;
int * const ptr = &a;
*ptr = update(a);
printf("a = %d ptr = %d ", a,--*ptr);
printf("a = %d ptr = %d ", a,++*ptr);
printf("a = %d ptr = %d ", a,--*ptr);
return 0;
} 
int update(int a)
{
int value=(a+a*a+a);
return value;
} 