#include<stdio.h> 
#include<string.h> 
int mystrlen( char *s );
int main()
{
    int result; 
    char name[50] ="Hello"; 

    result = mystrlen(name);

    printf("%d",result);  
    
    return 0; 
}
// Hello\0

int mystrlen( char *s )
{
        int i=0; 

        while(s[i]!='\0')
        {
            i++; 
        }
        return i; 

}



// int main()
// {
//     char name[50] ="Hello"; 

//     printf("%d",strlen(name)); 

//     return 0; 
// }