#include<stdio.h>

struct Employee
{
    int id;
    int salary;

   // void f1() // we can not define functions inside the structure 
    //{

    // }
};

// Structure and Functions 
void accept()
{
    struct Employee e1;
    printf("Enter ID ");
    scanf("%d",&e1.id);
    printf("\n Enter Salary :");
    scanf("%d",&e1.salary);
    printf("ID : %d Salary  : %d",e1.id,e1.salary);
}


int main(void)
{
    accept(); 
    struct Employee emp;
    emp.id=10;
    emp.salary=60000;

    return 0;
}