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
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%u  ",&arr[i][j]); 
            }
            printf("\n");
        }
        printf("\n");

    //int arr[3][3]={1,2,3,4,5,6,7,8,9};  

    int *ptr[3] = {arr,arr+1,arr+2}; 

    //   100       112        124 
    //  ptr[0]    ptr[1]     ptr[2] 
    //   500       504        508  

    printf("\n"); 
    // printf("%u ",ptr[0]);
    // printf("%u ",ptr[1]);
    // printf("%u ",ptr[2]);

    // printf("%u ",&ptr[0]);
    // printf("%u ",&ptr[1]);
    // printf("%u ",&ptr[2]);
    
    // printf("%d\n",*ptr[0]);
    // printf("%d\n",*(*(ptr+0)));
    
    // printf("%d\n",*ptr[1]);
    // printf("%d\n",*(*(ptr+1)));

    // printf("%d\n",*ptr[2]);
    // printf("%d\n",*(*(ptr+2)));
     
     printf("%d",ptr[0][0]);
     printf("%d",*(*(ptr+0)+0)); 
     //          *(*(ptr+0)+0);   

        

    return 0; 
}