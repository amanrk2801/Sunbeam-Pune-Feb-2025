#include<stdio.h> 

int main() 
{       
        // float fvar = 111.33
        // 2.3f
    //int num = 10; 
    // width specifier 

    //printf("%d",num); // 10 

    //printf("%8d",num); // 10 
    //             1 0 
    // - - - - - - - - 

    //printf("%5d",num); // 10
    //       1 0 
    // - - - - - 

    //printf("%-8d",num); // 10
    // 1 0 
    // - - - - - - - - 

    //printf("%08d",num); // 10
    //             1 0     
    // - - - - - - - -    
    
       //float fvar = 45.6;

       //printf("%6.3f",fvar);
       // 4 5 . 6 0 0 
       // - - - - - - 


       //printf("%6.2f",fvar);
       //   1 1 . 3 3  
       // - - - - - -  

       //printf("%8.3f",fvar);
       //       1 1. 3 3
       // - - - - - - - - 

    float fvar = 45.6;
    printf("%-8.3f",fvar);
    // 4 5 . 6 0 0 
    // - - - - - - - - 

    // float fvar1=11.33; 
    // printf("%.f",fvar1); 
      

    return 0; 
}