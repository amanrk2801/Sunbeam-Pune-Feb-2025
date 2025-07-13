#include<stdio.h> 

int main() 
{
     int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   
    int *ptr = arr;  // ptr is storing the base address 

     printf("%d\n",*ptr);    // 10

     printf("%d\n",++*ptr); // 11
     //++*ptr
     //++(*ptr)
     //++(valueat(ptr))
     //11 

     printf("%d\n",*++ptr);// 20  

     printf("%d\n",*ptr++);  
     // *ptr++
     //*ptr --> 20 

     printf("%d",*ptr);


    return 0;
}