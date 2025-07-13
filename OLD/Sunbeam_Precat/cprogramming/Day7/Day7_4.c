#include<stdio.h> 
int main() 
{
    // return 
    // break 
    // continue 
    // goto 

    int i; 

    for(i=1;i<=10;i++)
    {
        if(i==5) 
           break; 
        printf("i:%d\n",i); 
    }
    printf("Outside the for loop %d",i); 

     //int i; 

   // for(i=1;i<=10;i++)
    //{
        // if(i==5) 
        //    break;  // ERROR 
        // printf("i:%d\n",i); 
    //}
    printf("Outside the for loop"); 

    return 0; 


}

// int main() 
// {
//     // return 
//     // break 
//     // continue 
//     // goto 

//     return 0; 

//     printf("Hello world"); 

//     return 0; 


// }