#include<stdio.h> 
// I want to input a month as int and print number of days 
int main() 
{
    int month; 

    printf("Enter the month\n"); 
    scanf("%d",&month); //12

    // jump statement --> break  

    switch(month) // 12
    {   
        //case 1.5: // double   
        case  1:   
        printf("Jan has 31 days\n");
        break; 
        case 2: 
        printf("Feb has 28/29 days\n");
        break;  

        case 3: 
        printf("March has 31 days\n");  
        break; 

        case 4: 
        printf("April has 30 days"); 
        break; 

       
        printf("Invalid  default:case");
        break; 

    }
    printf("\n Outside the switch\n"); 


    return 0; 
}


   