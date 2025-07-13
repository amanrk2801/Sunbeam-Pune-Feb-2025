#include<stdio.h> 

int main() 
{
    // int num = 5;
    // int result =!num --> logical negation
    //     result!=num  

    printf("%d\n",12>3 && 11 > 1 );
    //          (12>3) && (11>1) 
    //             1   &&  1 
    //                  1  
    printf("%d",10>=3 || 2<1);
    //          (10>=3) || (2<1) 
    //              T   ||  XXX
    //                  T 
}