#include<stdio.h> 

int main() 
{
    int i; 
    char str[] = "Sunbeam infotech";  // string 

    for(i=0;str[i]!='\0';i++)
    {
        putchar(str[i]); 
    }

    printf("\n");

    printf("str = %s \n",str);  

    puts(str); 


    return 0; 
}