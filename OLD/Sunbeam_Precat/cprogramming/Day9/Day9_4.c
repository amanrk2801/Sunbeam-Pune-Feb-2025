#include<stdio.h> 

int main() 
{
     
    int num = 10; // 4 byte
    // 32 bit 


    int *ptr; // declaration of the pointer 
    // ptr is a name of the pointer variable  
// ptr is pointer to the integer variable 

     ptr = &num; // init the pointer variable  
    // referencing operation 
    // & --> referencing opr 



     printf("num=%d\n",num); // 10; 
     printf("&num=%u\n",&num);
     // address of num variable  

     printf("&ptr=%u\n",&ptr); 

     printf("ptr=%u\n",ptr);
     // value inside the ptr i.e address of num  

      // * --> dereferencing operation 

     printf("*ptr=%d",*ptr); // 10    


}