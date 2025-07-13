#include<iostream>
using namespace std;
#include "emp.h"

Employee::Employee()
{
    this->age=0;
    this->salary=0;
}
Employee::Employee(int age,int salary)
{
    this->age=age;
    this->salary=salary;
}
void Employee::accept()
{
    cout<<"Enter Age :";
    cin>>this->age;
    cout<<"Enter Salary:";
    cin>>this->salary;
}
void Employee::disp()
{
    cout<<" Age : "<<this->age<< " Salary : "<<this->salary<<endl;
}