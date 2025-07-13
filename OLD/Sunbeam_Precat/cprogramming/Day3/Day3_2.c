#include<stdio.h> 

int main() 
{   
    // by default type modifier is signed 
    //int num = 4;
    // num is capable of storing a unsigned value 
    //int num = -4;
    // num is also capable of storing signed value

    //signed int num = -4;    
    //printf("%d",num);

  //if you want to store only +ve value
    unsigned int num = 11 ; 
   // unsigned --> %u  
    printf("%u",num);    

    // char ch
    // by default it is considered as signed 
     
    // unsigned char ch; 

    return 0; 
}