#include<stdio.h> 

int add( int a, int b);
int main() 
{
        //int (*ptr)(int); 
//ptr is a pointer to the function that accepts 
// the integer and return the integer value  

    // assigning the address 
    int (*ptr1)(int,int)=add;

    int (*ptr2)(int,int)=&add;    

    (*ptr1)(10,2);// calling the function by dereferencing function pointer

     ptr2(2,3);//calling the function using the pointer name    
}

int add( int a, int b)
{
    printf("Result is %d\n",a+b); 
}

/*
    int(*arr[4])(int,int) 
    //Array of function pointers 

    int (*arr[4])(int,int) = { add, sub,mult,divv} 


*/