#include<stdio.h> 

int main() 
{
    FILE *fptr;  

    char ch;
    fptr = fopen("sunbeam.txt","w"); 

    if(fptr==NULL)
    {
        printf("Unable to create"); 
        return 0; 
    }   

    printf("Specify the char");

    while( ( ch=getchar())!='Q')
    {
        fputc(ch,fptr); 
    }
    printf("\n Sucess"); 

    fclose(fptr); 
    return 0; 
}