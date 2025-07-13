#include<stdio.h> 
#include"test.h"

//.c --> .i (expanded source code )
// user defined function 
int main()
{
    double rad,area; 

    printf("Enter the radius");
    scanf("%lf",&rad);

    area = PI * rad * rad; 

    printf("area = %lf",area); 


    return 0; 
}