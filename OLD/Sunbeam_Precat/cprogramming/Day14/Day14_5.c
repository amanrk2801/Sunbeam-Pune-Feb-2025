#include<stdio.h> 
//#pragma pack(1)
struct test
{
    int a;  
    char c; 
}; 

int main() 
{   
    printf("%d",sizeof(struct test)); 
    return 0; 
}