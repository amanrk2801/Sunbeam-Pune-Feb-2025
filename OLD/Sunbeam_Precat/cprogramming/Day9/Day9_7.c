#include<stdio.h> 
// 32 bit --> pointer size is  4 bytes 
// 64 bit --> pointer size is 8 bytes 
int main() 
{
    int *ptr;
    char *cptr;
    float *fptr; 

    printf("%d %d %d",sizeof(ptr),sizeof(cptr),sizeof(fptr));


}