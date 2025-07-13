#include<iostream>
#include<string>
using namespace std;

class Person
{
    private:
    string name;
    int age;
    public:
    Person()
    {
        cout<<"Person class Parameterless constructor"<<endl;
        this->name="DEFAULT";
        this->age=1;
    }
    Person(string name,int age)
    {
        cout<<"Person class Parametrized constructor"<<endl;
        this->name=name;
        this->age=age;
        
    }
    void print_person_data()
    {
        cout<<" Name :"<<this->name<<" Age :"<<this->age<<endl;
    }
    ~Person()
    {
        cout<<"Inside Person class destructor"<<endl;
    }
};
//class Derived_class_name : MODE_OF_INHERITANCE Base_class_name 
//{
//}
class Employee:public Person 
{
    int id;
    int salary;
    public:
    Employee()
    {
        cout<<"Inside Parameterless constructor of Employee class"<<endl;
        this->id=1;
        this->salary=10000;
    }

    //if we wish to give a call to paramatrized constructor of super class
    //we have to go for constructor member initializer list 
    Employee(string name,int age,int id,int salary):Person(name,age)
    {
        cout<<"Employee class Parametrized constructor"<<endl;
        this->id=id;
        this->salary=salary;
    }

    void print_emp()
    {
        print_person_data(); // calling the member function of base class directly
        cout<<" ID :"<<this->id<< " Salary :"<<this->salary<<endl;
    }
    
    ~Employee()
    {
        cout<<"Inside Employee  class destructor"<<endl;
    }
};


int main(void)
{
    Employee emp;
    emp.print_emp();
    Employee e1("abc",30,1,70000);
    e1.print_emp();
    return 0;
}


//in case of inheritance
// base class parameterless constructor gets called automatically
// Always first base class constructor is called and then derived class constructro gets called 
// destructor calling sequene is exactly opposite to constructor calling sequence
// destructor of child class gets called first and then parent class destructor gets called 




