#include <iostream>
using namespace std;

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
            throw 1; // int
        this->empid = empid;
    }
    void setName(string name)
    {
        if (name.size() < 2)
            throw "Length of char cannot be less than 2";
        this->name = name;
    }
    void setSalary(double salary)
    {
        if (salary <= 0)
            throw 1.2; // double
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
        e.setEmpId(-1);
        e.setSalary(100);
        e.setName("Rohan");
    }
    catch (...) // Generic Catch Block
    {
        cout << "Something went wrong.., Keeping the default value as it is" << endl;
    }

    e.display();
    cout << "Program Executed Successfully" << endl;
    return 0;
}

int main1()
{
    Employee e;
    try
    {
        e.setEmpId(-1);
        e.setSalary(100);
        e.setName("Rohan");
    }
    catch (int error)
    {
        cout << "Empid cannot be less than 0, Keeping the default value as it is" << endl;
    }
    catch (double error)
    {
        cout << "Salary cannot be less than 0, Keeping the default value as it is" << endl;
    }
    catch (const char *error)
    {
        cout << error << endl;
    }
    e.display();
    cout << "Program Executed Successfully" << endl;
    return 0;
}