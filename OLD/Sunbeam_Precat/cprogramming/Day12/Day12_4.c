#include<stdio.h> 

int main()
{
    int arr[][2]={1,2,3,4,5,6,7,8,9}; 

    /*
                [0]     [1]
     [0]         1       2 
     [1]         3       4
     [2]         5       6 
     [3]         7       8 
     [4]         9       0    

    
    
    */
    //printf("%d",arr[0][1]);

    int i,j; 
    for(i=0;i<5;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("%4d",arr[i][j]); 
        }
        printf("\n");
    }

    return 0; 
}