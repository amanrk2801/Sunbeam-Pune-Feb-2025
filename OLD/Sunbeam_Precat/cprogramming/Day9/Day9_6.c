#include<stdio.h> 

int main() 
{
    int num = 10; 
    int *ptr = &num; 
    int **pptr = &ptr; 

    printf("ptr = %u\n",ptr);
    printf("ptr = %u\n",&ptr);


    printf("ptr = %u\n",pptr); 

    printf("**pptr=%d\n",**pptr); 

    printf("*pptr=%u\n",*pptr); 


    return 0; 
}