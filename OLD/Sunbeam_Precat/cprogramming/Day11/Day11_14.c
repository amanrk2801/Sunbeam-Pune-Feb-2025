#include<stdio.h> 

int main() 
{
    // int num; 
    // //int *ptr;   // wild pointer
    // int *ptr = NULL;    
    
    int num = 10; 
    void *ptr = NULL;  // Generic pointer

    ptr = &num; // address of int  

    printf("%d",*(int*)ptr); 

    char ch = 'A'; 
    ptr = &ch;     // address of character 

    printf("%c",*(char*)ptr); 

}