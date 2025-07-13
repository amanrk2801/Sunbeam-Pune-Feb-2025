#include<stdio.h> 

int main() 
{
    char name[50],city[50],job[50];

    printf("Enter the name");
    //scanf("%s",name);// name represents the base address
    // %s will read-only upto white spaces ( space or tab )
    // Akshay --> Akshay 
    // Akshay Patil --> Akshay       
    scanf("%[^\n]%*c",name);// name represents the base address
    // it will read upto \n 

    printf("Enter the city"); 
    scanf("%s%*c",city); 

    printf("Enter the job"); 
    gets(job); // while scan the string upto \n

    

    printf("Name=%s \n city=%s \n job=%s",name,city,job); 

    return 0; 

}