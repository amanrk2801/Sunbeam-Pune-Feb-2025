#include<stdio.h> 
#include<limits.h> 


// char ch = 128
// printf("%d",ch);// -127   
// 0 1 2 3 .... 127 -128 -127 
int main()
{   
    // unsigned int num;  
    int num=2147483648 ;
    printf("%d\n",num); // prints -2147483648
    printf("%d\n",INT_MAX); 
    // 2147483647 
    printf("%d\n",INT_MIN);
    //-2147483648  
     
}