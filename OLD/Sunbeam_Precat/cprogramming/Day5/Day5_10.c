#include<stdio.h> 

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
           printf("Ammount=%lf",ammount);  
    }
    else 
    {
            printf("No discount Ammount=%lf",ammount); 
    }    
    



    return 0; 
}
// int main() 
// {
//  // If patient count is > 1000impose the lockdown    

//     int count; 

//     printf("Enter the count \n");
//     scanf("%d",&count); // 500 
//     if(count>1000)
//     {
//         printf("Impose the lockdown"); 
//     }
//     else 
//     {   
//         printf("No lockdown"); 
//     }
    


//     return 0; 
// }