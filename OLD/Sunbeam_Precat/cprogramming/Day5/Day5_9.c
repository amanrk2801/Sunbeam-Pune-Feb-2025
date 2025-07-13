
#include<stdio.h> 
//if ammount>=5000 give the discount of 10% 

int main() 
{
    double ammount,discount; 

    printf("Enter the ammount"); 
    scanf("%lf",&ammount); 

    if(ammount>=5000)
    {
           discount = ammount * 0.10;
           ammount = ammount - discount;    

    }
    printf("Ammount=%lf",ammount); 



    return 0; 
}