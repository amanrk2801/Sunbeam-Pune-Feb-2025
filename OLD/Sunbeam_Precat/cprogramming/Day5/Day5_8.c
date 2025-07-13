#include<stdio.h> 

int main() 
{
 // If patient count is > 1000impose the lockdown    

    int count; 

    printf("Enter the count \n");
    scanf("%d",&count); // 500 

    /*
    // if the condition is true then if block is
        if(condition)
        {

        }
    */

    if(count>1000)
    // if(3000 > 1000)
    // if(1)
    // if(TRUE) 
    {
        printf("Impose the lockdown"); 
    }
    printf("\n Outside the if block"); 


    return 0; 
}