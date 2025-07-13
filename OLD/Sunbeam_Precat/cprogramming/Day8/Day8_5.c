#include<stdio.h> 

int main() 
{
    int outer_var = 100; 
    {
        printf("%d\n",outer_var); 
        {
            int inner_var = 50;
            printf("%d",outer_var); // 100   
        }
        // printf("%d",inner_var); // error 
    }    
    return 0; 
}