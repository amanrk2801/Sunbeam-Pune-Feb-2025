#include<stdio.h> 
void sumpro( int a , int b ); 
int main()
{
    //auto --> automatic storage class
     auto int c; // local variable
    // c has block scope 
    // default value is garbage     
    // printf("%d",c); 

     int a = 10; // auto  / local  
     int b = 3;  // auto / local  
     sumpro(a,b);
     printf("Inside the main a =%d b=%d\n",a,b);  
     {
         int c = 10; 
         {
             int c = 100;
             printf("Inner : %d",c); // 100   
         
         }
         printf("Outer:%d",c); // 10  
     }




}
//             10        3  
void sumpro( int a , int b )
{
        int ps,pp; // local 
        ps = a + b;  // 13 
        pp = a * b;  // 30 
        printf("Sum = %d product = %d\n",ps,pp); 
        a++; 
        b++; 
}