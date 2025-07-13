#include<stdio.h> 

int main() 
{
    int marks; 

    FAIL: 
    printf("Enter the marks");
    scanf("%d",&marks); // 12

    if(marks>=35)
       goto PASS; 
    else 
        goto FAIL;

    PASS: 
    printf("Congratulations you are passed ..."); 

    return 0; 
}


