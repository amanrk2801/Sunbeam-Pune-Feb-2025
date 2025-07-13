#include<stdio.h> 

int main() 
{
    int i; 

// continue will take the control to nearest loop 
    for(i=1;i<=10;i++) //5
    {
        if(i%2==0)
           continue; 
        printf("%d\n",i); // 1 3 5 7 9  
    }
    printf("Outside the for loop %dn",i); 

    return 0; 
}