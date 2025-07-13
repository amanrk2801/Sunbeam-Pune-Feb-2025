#include<stdio.h> 

int main() 
{
    int num;
    char ch; 
    double dvar;
    float fvar;
// sizeof() --> sizeof returns number of bytes 

// printf("%d\n",sizeof(num)); // 4 bytes
// printf("%d\n",sizeof(ch));  // 1 byte
// printf("%d\n",sizeof(dvar));  // 1 byte  
// printf("%d\n",sizeof(fvar));  // 1 byte 

    printf("%d\n",sizeof('A'));
    //            sizeof(65)
    printf("%d\n",sizeof(12.33)); // 8 --> double 

    printf("%d\n",sizeof(12.33f));

    printf("%d\n",sizeof(132));




}