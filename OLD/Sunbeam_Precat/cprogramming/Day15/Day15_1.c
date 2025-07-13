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

    printf("specify the char"); 

    while((ch =getchar()) !='Q')
    {
        fputc(ch,fptr); 
    }   

    fclose(fptr); 
    return 0; 


}