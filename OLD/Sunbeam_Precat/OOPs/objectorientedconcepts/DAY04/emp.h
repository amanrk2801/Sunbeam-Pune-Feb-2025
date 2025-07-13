#include<iostream>
using namespace std;


class Employee
{
    int age;
    int salary;
    public:
    Employee();
    Employee(int age,int salary);
    void accept();
    void disp();
};