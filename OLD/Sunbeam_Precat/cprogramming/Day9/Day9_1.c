#include<stdio.h> 
//register int num=10; // ERROR  
int main() 
{
      register int num=10; 
      printf("%u",&num);   
    // printf("%d\n",num); // 10 
    // {
    //     // life and scope is block 
    //     register int num = 100; 
    //     printf("%d",num);// 100  
    // } 
    return 0; 
}