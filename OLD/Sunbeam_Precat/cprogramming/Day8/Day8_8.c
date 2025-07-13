#include<stdio.h> 
void fun();
 
int main() 
{   
    static int num = 10 ;
     
// static variable should be init at the time of declaration 
    
    printf("%d",num); 
    return 0; 
}

void fun()
{
    //printf("%d",num); //ERROR 
}