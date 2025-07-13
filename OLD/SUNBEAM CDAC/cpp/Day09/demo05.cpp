#include <iostream>
using namespace std;
class EmployeeException
{
private:
    string message;

public:
    EmployeeException()
    {
        message = "Something went wrong";
    }
    EmployeeException(string message)
    {
        this->message = message;
    }

    void printStackTrace() // display Function
    {
        cout << message << endl;
    }
};

class Employee
{
private:
    int empid;
    string name;
    double salary;

public:
    Employee()
    {
        empid = 0;
        name = "";
        salary = 0;
    }
    void setEmpId(int empid)
    {
        if (empid <= 0)
            throw EmployeeException();
        this->empid = empid;
    }
    void setName(string name)
    {
        if (name.size() < 2)
            throw EmployeeException("Length of char cannot be less than 2");
        this->name = name;
    }
    void setSalary(double salary)
    {
        if (salary <= 0)
            throw EmployeeException("Salary is very less");
        this->salary = salary;
    }
    void display()
    {
        cout << "Empid - " << empid << endl;
        cout << "Name - " << name << endl;
        cout << "Salary - " << salary << endl;
    }
};

int main()
{
    Employee e;
    try
    {
        e.setEmpId(1);
        e.setSalary(1000);
        e.setName("R");
    }
    catch (EmployeeException &error)
    {
        error.printStackTrace();
    }
    e.display();
    cout << "Program Executed Successfully" << endl;
    return 0;
}
