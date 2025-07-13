#include<stdio.h> 

int main() 
{
    int num = 1; 

    switch (num)
    {
    case 1:
        printf("One"); 
        break;
    //case 12>10: // 1  // case 1  ERROR
        printf("One ");
        break;          
    
    default:
        break;
    }
}