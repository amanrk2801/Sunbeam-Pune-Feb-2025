#include<stdio.h> 
int myfact( int num ); 
int main()
{
    int num; 
    int result; 

   printf("Enter the number"); 
   scanf("%d",&num); 

   result = myfact( num );      

   printf("%d",result);  

    return 0; 
}

int myfact( int num )
{
    int res; 
        if(num==0) // terminating condition 
           return 1;
        else 
           res = num * myfact ( num - 1);     

    return res;
}
