#include<stdio.h> 

int main()
{
    int arr[5] = { 10 ,20 ,30,40,50}; 
    //arr++; 
    // base address --> 100++ --> 100 = 100 + 1 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   
    
   // printf("%d\n",--arr[0]);


    // int *ptr1 = &arr[4]; // 116 
    // int *ptr2 = &arr[0]; // 100 
    // int result = ptr1 - ptr2; 
    // //  ( 116 - 100 ) / scale factor of ptr1 
    // //     16 / 4 
    // //      4  
    // printf("%d\n",result); 

     int i; 
     for(i=0;i<5;i++)
     {
         printf("%u\n",&arr[i]); 
     }
     printf("\n");
     printf("%u\n",&arr+1); 

}