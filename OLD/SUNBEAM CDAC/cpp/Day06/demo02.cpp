#include <iostream>
using namespace std;

class Date
{
private:
    int day;
    int month;
    int year;

public:
    Date()
    {
        cout << "Inside Date Ctor- " << endl;
    }
    void acceptDate()
    {
        cout << "Enter day - ";
        cin >> day;
        cout << "Enter month - ";
        cin >> month;
        cout << "Enter year - ";
        cin >> year;
    }

    void displayDate()
    {
        cout << "Date - " << day << "/" << month << "/" << year << endl;
    }
};

class Car
{
private:
    string name;
    string color;

public:
    Car()
    {
        cout << "Inside Car Ctor- " << endl;
    }
    void acceptCar()
    {
        cout << "Enter name of car - ";
        cin >> name;
        cout << "Enter color of car - ";
        cin >> color;
    }
    void displayCar()
    {
        cout << "Name of car - " << name << endl;
        cout << "Color of car - " << color << endl;
    }
};

class Employee
{
private:
    int empid;
    string name;
    double salary;
    Date doj;         // Association -> Composition
    Car *cptr = NULL; // Association -> Aggegration

public:
    Employee()
    {
    }

    void acceptEmployee()
    {
        cout << "Enter empid - ";
        cin >> empid;
        cout << "Enter name - ";
        cin >> name;
        cout << "Enter salary - ";
        cin >> salary;
        cout << "Enter Date of joining - " << endl;
        doj.acceptDate();
    }

    void addCar()
    {
        cptr = new Car();
        cptr->acceptCar();
    }

    void displayEmployee()
    {
        cout << "Empid - " << empid << endl;
        cout << "Name - " << name << endl;
        cout << "Salary - " << salary << endl;
        cout << "Joining  ";
        doj.displayDate();

        if (cptr != NULL)
            cptr->displayCar();
    }

    ~Employee()
    {
        if (cptr != NULL)
        {
            delete cptr;
            cptr = NULL;
        }
    }
};

int main()
{
    Employee e1;
    e1.acceptEmployee();
    e1.displayEmployee();

    Employee e2;
    e2.acceptEmployee();
    e2.addCar();
    e2.displayEmployee();
    return 0;
}