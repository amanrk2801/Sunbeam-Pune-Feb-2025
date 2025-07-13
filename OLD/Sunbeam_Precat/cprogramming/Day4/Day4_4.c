#include<stdio.h> 
int main() 
{
    char ch='A';
    int num = 100; 
    double dvar=12.33;
    short int sh=12;   

    // sizeof operator is evaluated at compile time 
   printf("%d\n",sizeof(ch+num+dvar)); 
   //                 char int double  

    printf("%d",sizeof(ch+sh));

    


}