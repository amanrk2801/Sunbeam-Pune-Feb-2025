#include<iostream>

struct Employee
{
    int id;
    int salary;
    void accept() // function definition is allowed inside structure body in C++
    {
        printf("Enter ID :");
        scanf("%d",&id);
        printf("\n Enter Salary :");
        scanf("%d",&salary);
        printf(" \n ID : %d Salary : %d ",id,salary);
        
    }
};
int main(void)
{
    struct Employee emp;
    emp.accept();
    return 0;
}