#include<stdio.h> 

int main() 
{
    // a - z --> 97 to 122
    // A - Z --> 65 to 90 
    // 0 to 9 --> 48 to 57 

        char ch;
        printf("Enter the character"); 
        ch = getchar();
        // putchar()// printf("%c",ch); 
          
        // scanf("%c",&ch);
        // ch=2 
       if(ch>=97 && ch<=122)
       {
           printf("Lower case "); 
       }
       else
       {
            if(ch>=65 && ch<=90)
            {
                printf("Upper case"); 
            }
            else
            {
                  if(ch>=48 && ch<=57)
                  {
                      printf("It is a digit"); 
                  }
                  else 
                  {
                      printf("Special symbol"); 
                  }  


            }
            


            return 0;


       }
        




}