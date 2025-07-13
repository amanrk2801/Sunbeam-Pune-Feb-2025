#include<stdio.h> 

int main() 
{
    int num = 10;
    int *ptr = &num; 

    printf("%d\n",num);  // 10 
    printf("%d\n",*ptr); // 10
    // *ptr
    //valueat(ptr)
    // valueat(100)
    // 10  
    printf("%d\n",ptr); // pointing to the num  
    //    100 + 1 
    //    104    
    ptr = ptr + 1; 
    // ptr is ahead with 4 bytes  

    printf("%d\n",ptr); 
    printf("%d\n",*ptr); 

    ptr = ptr - 1;
    //104 
    //   104 - 1 
    //   100   

    printf("%d\n",ptr); 
    printf("%d\n",*ptr); 
 



}
