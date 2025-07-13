#include<stdio.h> 
void printArray(int arr[5]); 
void readArray(int arr[5]);
int main()
{
    int arr[5];

     //  [0]   [1]     [2]    [3]    [4]
    //   10     20     30     40     50  
    //  100    104    108    112    116 
    readArray(arr); // base address

    printArray(arr);// base address      

    return 0; 
}
void printArray(int arr[5]) 
{
        int i; 
        for(i=0;i<5;i++)
        {
            printf("%d",arr[i]);    
        }

}
void readArray(int arr[5])  
{
        int i; 
        for(i=0;i<5;i++)
        {
            scanf("%d",&arr[i]); 
            // 10 20 30 40 50    
        }

}