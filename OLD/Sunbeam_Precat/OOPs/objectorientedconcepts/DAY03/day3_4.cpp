#include<iostream>
using namespace std;

class Employee
{
    int id;
    int salary;
    public:
    Employee()
    {
        this->id=0;
        this->salary=0;
    }
    Employee(int id,int salary)
    {
        this->id=id;
        this->salary=salary;
    }
    ~Employee()
    {}

    // accept() and disp() called as facilitators
    void accept()
    {
        cout<<"Enter ID :";
        cin>>this->id;
        cout<<"\n Enter Salary :";
        cin>>this->salary;
    }
    void disp()
    {
        cout<<" ID : "<<this->id<<"  Salary : "<<this->salary<<endl;
    }
    // getID() and getSalary() are the getters 
    int getID()
    {
        return this->id;
    }
    int getSalary()
    {
        return this->salary;
    }
    //setID() and setSalary() are the setters 
    void setID(int id)
    {
        this->id=id;
    }

    void setSalary(int newsal)
    {
        this->salary=newsal;
    }
};

int main(void)
{
   // Employee e1; 
    //e1.disp();
    //Employee e2(2,60000);
    //e2.disp();
    int newsal;
    Employee e3;
    e3.accept();
    //e3.disp();
    //cout<<e3.id; // private (NOT ALLOWED)
    cout<<"\n third Object ID : "<<e3.getID();
    cout<<"\n third Object salary : "<<e3.getSalary();
    cout<<"\n Enter New salary of third object :";
    cin>>newsal;
    e3.setSalary(newsal);
    e3.disp();
    return 0;
}