#include <iostream>
using namespace std;

class Date
{
private:
    int day;
    int month;
    int year;

public:
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
    Date doj;

public:
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

    void displayEmployee()
    {
        cout << "Empid - " << empid << endl;
        cout << "Name - " << name << endl;
        cout << "Salary - " << salary << endl;
        cout << "Joining  ";
        doj.displayDate();
    }
};

class Student
{
    // todo implement the class
    // Date dob;
};

int main()
{
    Employee e1;
    e1.acceptEmployee();
    e1.displayEmployee();
    return 0;
}