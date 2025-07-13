#include<stdio.h> 
void sumpro( int a , int b ); 

// variable declared inside the main --> local variable 
// variable declared outside the main --> global variable 

extern int ps,pp; // for the compiler  
int main()
{
   
     int a = 10; // auto  / local  
     int b = 3;  // auto / local  
     sumpro(a,b);
     printf("Sum = %d product = %d\n",ps,pp); 
     // ps and pp are accessing the global variables 


}
int ps; 
int pp;


void sumpro( int a , int b )
{
        
        ps = a + b;  // 13 
        pp = a * b;  // 30 
       
       
}

