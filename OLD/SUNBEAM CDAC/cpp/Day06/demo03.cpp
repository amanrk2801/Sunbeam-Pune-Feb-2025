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
        cout << "Inside Date Parameterless Ctor- " << endl;
        day = 1;
        month = 1;
        year = 2000;
    }
    Date(int day, int month, int year)
    {
        cout << "Inside Date Parameterized Ctor- " << endl;
        this->day = day;
        this->month = month;
        this->year = year;
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
        cout << "Inside Car parameterless Ctor- " << endl;
    }
    Car(string name, string color)
    {
        this->name = name;
        this->color = color;
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
        cout << "Inside Employee Paramaterless Ctor " << endl;
        empid = 0;
        name = "";
        salary = 100;
    }

    Employee(int empid, string name, double salary)
    {
        cout << "Inside Employee Parameterized Ctor " << endl;
        this->empid = empid;
        this->name = name;
        this->salary = salary;
    }

    Employee(int empid, string name, double salary, int day, int month, int year) : doj(day, month, year)
    {
        cout << "Inside Employee Parameterized Ctor " << endl;
        this->empid = empid;
        this->name = name;
        this->salary = salary;
    }

    Employee(int empid, string name, double salary, int day, int month, int year, string name, string color) : doj(day, month, year)
    {
        cout << "Inside Employee Parameterized Ctor " << endl;
        this->empid = empid;
        this->name = name;
        this->salary = salary;
        cptr = new Car(name, color);
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
    // Employee e1;
    // e1.acceptEmployee();
    // e1.displayEmployee();

    Employee e1(1, "rohan", 10000);
    e1.displayEmployee();

    Employee e2(2, "nilesh", 20000, 2, 2, 2010);
    e2.displayEmployee();

    Employee e3(3, "nitin", 30000, 3, 3, 2005, "innova", "grey");
    e3.displayEmployee();
    return 0;
}