#include<stdio.h> 

#define ADD(a,b) (a+b)
#define MULTIPLY(a,b) (a*b)
#define SQR(x) ((x) * (x))

int main() 
{

    printf("add=%d\n",ADD(3,4)); 
    //printf("add =%d\n",(3+4)); // 7 

   printf("Multiply=%d\n",MULTIPLY(3,4));
   //printf("add =%d\n",(3*4)); // 12 


   printf("square=%d\n",SQR(2+3));
   //printf("square = %d\n",((2+3) * (2+3))    

   printf("Multiply=%d\n",MULTIPLY(2+1,3+1));
   //                             (2+1 * 3 + 1 );
   //                               6   
    return 0; 
}

//gcc Day13_3.c -E -o Day13_3.i --> .i file