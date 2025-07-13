#include<stdio.h> 

int main() 
{
    int num=1234;
    // 1 * 1000 + 2 * 100 + 3 * 10 + 4 // 1234 

    // 4 * 1000 + 3 * 100 + 2 * 10 + 1 // 4321 

    int digit1,digit2,digit3; 

    digit1 = num % 10; // 1234 % 10 // 4 
    num = num / 10; // 1234 / 10 // 123  
    //printf("%d %d",digit1,num);  

    digit2 = num % 10; // 123 % 10 // 3 
    num = num / 10; // 123 / 10 // 12
    //printf("%d %d",digit2,num);   

    digit3 = num % 10; // 12 % 10 // 2 
    num = num / 10;  // 12 / 10 // 1
    printf("%d %d",digit3,num);    


    return 0; 
}