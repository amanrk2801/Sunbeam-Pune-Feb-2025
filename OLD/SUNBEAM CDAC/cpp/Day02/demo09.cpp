#include <iostream>
using namespace std;

class Employee
{
private:
    int empid;
    string name;
    double salary;

public:
    void acceptEmployee()
    {
        cout << "Enter emp id - ";
        cin >> empid;
        cout << "Enter emp name - ";
        cin >> name;
        cout << "Enter salary - ";
        cin >> salary;
    }

    void displayEmployee()
    {
        cout << "Emp id - " << this->empid << endl;
        cout << "Emp Name - " << this->name << endl;
        cout << "Emp Salary - " << this->salary << endl;
    }
};

int main()
{
    Employee e1;
    Employee e2;

    e1.acceptEmployee();
    e2.acceptEmployee();

    e1.displayEmployee();
    e2.displayEmployee();
    return 0;
}