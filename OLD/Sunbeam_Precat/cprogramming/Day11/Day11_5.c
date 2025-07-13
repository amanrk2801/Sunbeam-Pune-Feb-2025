#include<stdio.h> 

int main() 
{
    char str[50]; 

    printf("Enter the name"); 
    //scanf("%s",str); 
    //scanf("%[^\n]",str); 
    //scanf("%[a-z]",str); // take the i/p in char range a-z
    //scanf("%[0-9]",str); //take the i/p in 0-9 
    scanf("%[a-zA-Z]",str); 
    printf("%s",str);
    return 0; 
}