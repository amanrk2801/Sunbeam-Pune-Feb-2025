#include<stdio.h> 

int main() 
{
    // logical and relation operator --> 0 and 1 
    //     11 && 12 --> 1 
    //     12 || 10 --> 1         

    // bitwise operators 
    // 1. & --> bitwise and 

    // int num1 = 10 ; 
    // int num2 = 5; 
    // //  0000 1010 
    // //  0000 0101
    // //-------------
    // //  0000 0000

    // printf("%d",num1&num2); 

    // int num1 = 10 ; 
    // int num2 = 5; 
    // //  0000 1010 
    // //  0000 0101
    // //-------------
    // //  0000 1111

    // printf("%d",num1|num2);   

    // int num1 = 10 ; 
    // int num2 = 5; 
    // //  0000 1010 
    // //  0000 0101
    // //-------------
    // //  0000 1111

    // printf("%d",num1^num2); 

    int num = 10; 
    /*
            binary of 10 

            0000  1010 

                invert the bits 
            
            1111  0101 --> after inverting 

          1s compliment --> 0000 1010

            0000 1010
                    1
            -----------
            0000  1011  ( 2s compliment ) 

                -11            

        ~num --> -( n + 1 ) --> - ( 10 + 1 )
                            --> -11  
    
    */
    printf("%d",~num); 


    



    return 0;

}