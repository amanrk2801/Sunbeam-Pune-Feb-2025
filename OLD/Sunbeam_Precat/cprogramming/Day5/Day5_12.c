#include<stdio.h> 

int main()
{
    int a =1000;
    int b =200; 
    int c =300; 

    if(a>b)// 1000 > 200 
    {
        if(a>c)// 1000 > 300 
        {
            printf("a=%d",a);// 1000  
        }
        else
        {
           printf("c=%d",c);  
        }
        
    }
    else 
    {
        if(b>c)
        {
            printf("b=%d",b);
        } 
        else
        {
            printf("c=%d",c); 
        }
        
    }


}