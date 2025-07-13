#include "employee.h"

int main()
{
    Person p;
    p.accept();
    p.display();

    Employee e;
    e.accept();
    e.display();

    Person *ptr = new Employee();
    ptr->accept();
    ptr->display();
    delete ptr;
    ptr = NULL;
    return 0;
}