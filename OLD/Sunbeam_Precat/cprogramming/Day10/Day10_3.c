#include<stdio.h> 
//int arr[5];  // Global array 
int main() 
{
    //int arr[5] = { 10 ,20 ,30,40,50}; 
    //int arr[5] = { 10 ,20 ,30};// partial init  
    // if array is partially init rest element are init to 0 
    //int arr[5];// partial init  
    // int arr[]; // size is mandatory 
    //int arr[] = { 10 ,20 ,30 ,40 ,50};  
    
    int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   

    int i; 

    for(i=0;i<5;i++)
    {
                // values 
            printf("%d ",arr[i]); // 10 20
    }
    // for(i=0;i<5;i++)
    // {
                // address
    //         printf("%u ",&arr[i]); 
    // }



    return 0; 
}
/*

*/