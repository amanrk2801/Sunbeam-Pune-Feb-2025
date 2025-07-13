#include<stdio.h> 
int add(int a , int b ); // function declaration/prototype/signature
// add is a user-defined function which is taking 2 arguments of 
// type integer and returning the result of type integer 
int main() 
{   
    int num1,num2,res; 
    printf("Enter the num1 and num2\n"); 
    scanf("%d%d",&num1,&num2); // 2 1
    // I/p --> num1 = 2 num2 = 1  

    //3 
    res = add(num1,num2); // 2 1 
    // num1 and num2 are the actual arguments  
    // function call  

    printf("res = %d",res);

    

    return 0; 
}
// main --> calling function 
// add  --> called function 

// function defination
//     a=2     b=1 
int add(int a , int b ) // it will take the i/p and give the addition of two numbhers 
//return-type function-name ( formal arguments )
{
      int result; 
      result = a + b;   // 2 + 1 
      return result;    // 3 
} 

// Add function is taking 2 inputs and returining 
// the result 


