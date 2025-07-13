#include<stdio.h> 

int main() 
{
    int a=10,b=20,c=30;

    if( a > b && a > c )
    {
        printf("a=%d",a); 
    }
    else 
    {
        if(b>c)
          printf("b=%d",b);
        else
          printf("%d",c);  
    }


}