#include<stdio.h> 

int main() 
{
    char ch; 

    printf("Enter the character"); 
    ch = getchar(); // a
    // scanf("%c",&ch);

    switch(ch)
    {
        case 'a': // 97 
        case 'A': // 65 
        printf("A for Android"); 
        break; 

        case 'b': 
        case 'B': 
        printf("B for Basic"); 
        break; 

        
        case 'c': 
        case 'C': 
        printf("C for C programming"); 
        break; 
   
        
        case 'd': 
        case 'D': 
        printf("D for Database"); 
        break; 

        default: 
        printf("I dont know the technology\n");

    
    }   


    return 0; 
}