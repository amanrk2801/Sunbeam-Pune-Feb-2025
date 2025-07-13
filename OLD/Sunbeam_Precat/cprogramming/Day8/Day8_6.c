#include<stdio.h> 

//global variables -- can be accessed in whole program 
// created when program is started--even before main is called              
// created on data section  --> default value is 0 

int ps,pp; // Global variables 

//Destroyed when program is terminated 
// after the completion of main()  


void sumpro( int a , int b ); 
int main()
{
   
     int a = 10; // auto  / local  
     int b = 3;  // auto / local  
     sumpro(a,b);
     printf("Sum = %d product = %d\n",ps,pp); 
     // ps and pp are accessing the global variables 


}

void sumpro( int a , int b )
{
        
        ps = a + b;  // 13 
        pp = a * b;  // 30 
       
       
}

// void sumpro( int a , int b ); 
// int main()
// {
   
//      int a = 10; // auto  / local  
//      int b = 3;  // auto / local  
//      sumpro(a,b);
//      printf("Sum = %d product = %d\n",ps,pp); 
// // main cannot access local variables in another function 
// // scope of ps and ps are limited to sumpro() function  


// }
// //             10        3  
// void sumpro( int a , int b )
// {
//         int ps,pp; // local 
//         ps = a + b;  // 13 
//         pp = a * b;  // 30 
       
       
// }