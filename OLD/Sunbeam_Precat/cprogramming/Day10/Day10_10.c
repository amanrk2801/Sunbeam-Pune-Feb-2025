
#include<stdio.h> 
void printArray(int arr[5]); 
int main() 
{
    int arr[5]={10,20,30,40,50};

     //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116 

    

    // arr is name of array --> base address
    printArray(arr); 

    printf("\n");
     int i; 
    for(i=0;i<5;i++)
    {
        printf("%d\n",arr[i]);
        
    }

}
//                   100 --> base address // array notation
void printArray(int *ptr) // pointer notation 
{
    int i; 
    for(i=0;i<5;i++)
    {
        printf("%d\n",ptr[i]);
        // 10 20 30 40 50  
    }
    for(i=0;i<5;i++)
    {
     
            ++ptr[i]; 
    }
}
// #include<stdio.h> 
// void printArray(int arr[5]); 
// int main() 
// {
//     int arr[5]={10,20,30,40,50};

//      //  [0]   [1]     [2]    [3]    [4]
//     //   10    20      30    40      50   
//     //  100    104    108    112    116 

    

//     // arr is name of array --> base address
//     printArray(arr); 

//     printf("\n");
//      int i; 
//     for(i=0;i<5;i++)
//     {
//         printf("%d\n",arr[i]);
        
//     }

// }
// //                   100 --> base address // array notation
// void printArray(int arr[5])
// {
//     int i; 
//     for(i=0;i<5;i++)
//     {
//         printf("%d\n",arr[i]);
//         // 10 20 30 40 50  
//     }
//     for(i=0;i<5;i++)
//     {
     
//             ++arr[i]; 
//     }
// }