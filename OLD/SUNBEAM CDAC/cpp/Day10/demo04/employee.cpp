#include "employee.h"

// class defination
Employee::Employee()
{
    cout << "Employee Paramterless Ctor - " << endl;
}
Employee::Employee(int id, double salary)
{
    cout << "Employee Paramterized Ctor - " << endl;
}

void Employee::accept()
{
    cout << "Employee accept() - " << endl;
}
void Employee::display()
{
    cout << "Employee display() - " << endl;
}