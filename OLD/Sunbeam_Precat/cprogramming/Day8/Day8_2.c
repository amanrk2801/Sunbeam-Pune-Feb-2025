#include<stdio.h> 
int add( int num1 , int num2 ); 

//int add( int  , int  ); 
int main() 
{   

    int num1, num2; 
    int result;     
    printf("Enter the num1 and num2"); 
    scanf("%d%d",&num1,&num2); 

    
    result = add ( num1 , num2); 

    printf("result  = %d", result); 

    return 0; 

}
int add( int num1 , int num2 )
{
    int result; 
    result = num1 + num2; 
    return result; 
}

