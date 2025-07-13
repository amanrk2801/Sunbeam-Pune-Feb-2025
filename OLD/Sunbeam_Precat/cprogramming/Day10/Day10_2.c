#include<stdio.h> 

int main() 
{   
    // Array 

    // int num1,num2,num3,num4,num5; 
    // num1 = 10; // 100 --> memory locations 
    // num2 = 200; // 200 
    // num3 = 30; // 400 
    // num4 = 440; 
    // num5 = 50;   


    // elements of the array share the same name 
    int arr[5]={10,20,30,40,50};// init list 
    // array elements are stored in contigous memory locations 

    //   0       1     2      3       4   
    //   10     20     30     40     50
    //   100    104    108    112    116 
    //  arr[0] arr[1] arr[2] arr[3]  arr[4]       

    // arr --> name of the array 
    // array can store/hold 5 integer elements   

    printf("%d",arr[0]); // 10 
    printf("%d",arr[1]); // 20 
    printf("%d",arr[2]); // 30
    printf("%d",arr[3]); // 40 
    printf("%d",arr[4]); // 50 
     

    return 0; 
}