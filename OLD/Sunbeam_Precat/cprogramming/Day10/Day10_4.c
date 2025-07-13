#include<stdio.h> 

int main() 
{
     int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   

 // Name of array represents the base address  

    //printf("%u\n",&arr[0]); 
    //printf("%u\n",arr); 
    // arr is the name of the array 
    // name of array --> base address


       printf("%u\n",arr); // base address  
       printf("%u\n",arr+1);
       // arr + 1 
       // 100 + 1 * 4 
       // 104    
       printf("%u\n",arr+2);
       // arr + 2 
       // 100 + 2 * 4  
       // 108 
       printf("%u\n",arr+3);
       // arr + 3 
       // 100 + 3 * 4
       // 112 
       printf("%u\n",arr+4);
       // arr + 4 
       // 100 + 4 // 100 + 4 * 4
       // 116  



    return 0; 
}