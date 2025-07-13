#include<stdio.h> 

int main() 
{
    // int num;  // variable declaration 
    // // 4 bytes memory space is allocated 
    // // printf--> print function 
    // // scanf --> scanning the value 

    // printf("Enter the value\n");
    // scanf("%d",&num); //50
    // // & --> address of operator   

    // printf("number = %d",num); 
    // //      number = 50

    // int num1,num2; 
    // printf("Enter the num1\n"); 
    // scanf("%d",&num1); // 10

    // printf("Enter the num2\n");
    // scanf("%d",&num2); // 20 

    // printf("num1=%d num2=%d",num1,num2); 
    // //      num1=10 num2=20

    
    // int num1,num2; 
    // printf("Enter the num1\n"); 
    // scanf("%d%d",&num1,&num2); // 10 20

    // printf("num1=%d num2=%d",num1,num2); 
    // //      num1=10 num2=20


    
    int num1;
    float fvar;
    int num2;  
    printf("Enter the num1\n"); 
    scanf("%d%f%d",&num1,&fvar,&num2); // 10
 

    printf("num1=%d fvar=%f num2=%d",num1,fvar,num2); 
    //      num1=10 fvar=11.33 num2=20


    return 0;
}