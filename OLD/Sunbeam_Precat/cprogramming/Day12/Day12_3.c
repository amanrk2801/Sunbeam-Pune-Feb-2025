#include<stdio.h> 
//int arr[3][3]; // global default value 0 
int main() 
{

    int arr[3][3]={1,2,3,4,5,6,7,8,9}; 
   //int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
   //int arr[3][3]={{1},{4,5},{7,8,9}};

    //int arr[3][3];   

    //int arr[][]={1,2,3,4,5,6,7,8,9};// Error 

    //int arr[][3]={1,2,3,4,5,6,7,8,9};  
    //int arr[3][]={1,2,3,4,5,6,7,8,9};// Error   
    //int arr[3][3]={1}; 

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
    int i,j; 

    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%4d",arr[i][j]); 
        }
        printf("\n");
    }

    printf("\n");

   



    return 0; 
}