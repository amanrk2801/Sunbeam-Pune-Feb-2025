#include<stdio.h> 
#include<string.h> 
char* mystrcpy(char *dest, const char *src); 
int main() 
{
    char src[50] = "Hello";
    char dest[50];

    mystrcpy(dest,src); 

    puts(dest); 

}

//src -- > Hello\0 
//dest-->  Hello\0  --> string 

char* mystrcpy(char *dest, const char *src)
{
    int i = 0; 

    while(src[i]!='\0')
    {
        dest[i] = src[i]; 
        i++;
    }

    dest[i] = '\0'; 

    return dest; 

}


// int main() 
// {
//     char src[50] = "Hello";
//     char dest[50];

//     strcpy(dest,src); 

//     puts(dest); 

// }