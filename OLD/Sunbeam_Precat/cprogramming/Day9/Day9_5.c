#include<stdio.h> 

int main() 
{
     
    int num = 10; // 4 byte  

    int *ptr= &num; // declaration of the pointer 

    printf("num =%d\n",num); // 10 
    printf("*ptr=%d\n",*ptr); // 10 

    *ptr = 1000; 

    
    printf("num = %d\n",num); // 10 
    printf("*ptr=%d\n",*ptr); // 10 


}