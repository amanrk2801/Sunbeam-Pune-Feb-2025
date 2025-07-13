#include<stdio.h> 

int main()
{
     int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   

 // Name of array represents the base address  

    printf("%d\n",arr[0]);// 10 // array notation  
    printf("%d\n",*(arr+0)); // 10 // pointer notation 
    printf("%d\n",0[arr]);// 10 

    // arr[0] --> will print element at index 0 using array notation 
    // *(arr+0)-->will print element at index 0 using pointer notation

    // arr --> base address 
    // arr+1 --> base address + 1      




}