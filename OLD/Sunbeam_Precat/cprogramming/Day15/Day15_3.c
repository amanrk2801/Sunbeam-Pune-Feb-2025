#include<stdio.h> 
int add( int a , int b); 
int main() 
{
     
    // function pointer 

    // declaring the function pointer 

       //int (*ptr)(int); 
  //ptr is a pointer to the function that accepts the 
  // integer and returns the integer        

    //1. Assigning the address 
    int (*ptr1)(int,int) = add; 

    //2. Assigning the address
    int (*ptr2)(int,int) = &add;  

    // calling the function using dereferencing opr
    (*ptr1)(10,12); 

    // calling the function using dereferencing opr
    ptr2(10,2); 

    // array of function pointers 
    // int (*arr[4])(int,int); 

    //int (*arr[4])(int,int) = { add,sub,mult,divv};  
    
    /*
        int lc; 

        for(lc=0;lc<4;lc++)
        {
            arr[lc](6,2);
        }
    
    */

    return 0; 
}

int add( int a , int b)
{
    printf("The result of add is %d",a+b); 
}
