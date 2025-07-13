#include<stdio.h> 

int main() 
{
    int arr[3][3]={1,2,3,4,5,6,7,8,9}; 
  // C follows row major order    
/*
            [0]    [1]    [2]
    [0]      1      2      3 
           100     104    108

    [1]      4      5      6 
          112     116     120 

    [2]      7      8      9 
          124     128    132      

*/
    //array notation 
    printf("%d\n",arr[0][0]); // 1  
    // 0th row annd 0th col 
    printf("%d\n",arr[0][1]); // 2
    printf("%d\n",arr[0][2]); // 3


    printf("%d\n",arr[1][0]); // 4 
    // 0th row annd 0th col 
    printf("%d\n",arr[1][1]); // 5
    printf("%d\n",arr[1][2]); // 6

    printf("%d\n",arr[2][0]); // 4 
    // 0th row annd 0th col 
    printf("%d\n",arr[2][1]); // 5
    printf("%d\n",arr[2][2]); // 6





    return 0; 
}