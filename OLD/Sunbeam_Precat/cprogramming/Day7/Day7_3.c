#include<stdio.h> 

// nested loop 
int main() 
{
    int i,j,k; 


    // // i = 1 --> j --> 1 2 3 4 5
    // // i = 2 --> j --> 1 2 3 4 5  
    // // i = 3 --> j --> 1 2 3 4 5 
    // for(i=1;i<=5;i++)
    // {
    //       printf("For each i %d",i); 
    //       for(j=1;j<=5;j++)
    //       {
    //           printf("j:%d ",j);// 1 2 3 4 5   
    //       }  
    //       printf("\n");

    // }

    // i = 1 --> j --> 1 2 3 4 5
    // i = 2 --> j --> 1 2 3 4 5  
    // i = 3 --> j --> 1 2 3 4 5 
    for(i=1;i<=5;i++)
    {
          printf("For each i %d",i); 
          for(j=1;j<=5;j++)
          {
              printf("For each j %d",j); 
              for(k=1;k<=5;k++)
              {
                  printf("k : %d",k);
                   
              }
              printf("\n"); 

          } 

          printf("\n"); 
     
    }


}