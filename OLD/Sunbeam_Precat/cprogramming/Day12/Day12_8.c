#include<stdio.h> 
void readArray( int arr[3][3], int row , int col);
void printArray( int arr[3][3], int row , int col); 
int main() 
{
    int arr[3][3];

    readArray(arr,3,3);  

    printArray(arr,3,3); 
}

void printArray( int arr[3][3], int row , int col)
{
    int i,j; 
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("%4d",arr[i][j]); 
        }
        printf("\n");
    }

}
void readArray( int arr[3][3], int row , int col)
{
    int i,j; 
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&arr[i][j]); 
        }
    }

}