// header guard
// it checks for multiple inclusions of header file
#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include "person.h"

// class Declaration
class Employee : public Person
{
private:
    int id;
    double salary;

public:
    // declarations
    Employee();
    Employee(int id, double salary);
    void accept();
    void display();
};

#endif