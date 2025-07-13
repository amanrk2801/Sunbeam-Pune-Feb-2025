#include<stdio.h> 

int main() 
{
    int result; 
    int b = 2; 

    result = ++b,++b,++b;
    //result = b++,b++,b++;
    printf("result = %d b=%d",result,b);

    // result = (++b,++b,++b); 
    // printf("result = %d b=%d",result,b);

    // result = (b++,b++,b++); 
    // printf("result = %d b=%d",result,b);
}