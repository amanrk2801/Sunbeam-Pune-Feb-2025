#include <iostream>
using namespace std;
class Base
{
public:
    void f1()
    {
    }
};
class Derived : public Base
{
public:
    void f2()
    {
    }
};

class Employee
{
};

class Person
{
};

int main()
{
    Employee *eptr = new Employee();
    // Person *p = (Person *)eptr; // OK
    // Person *p = static_cast<Person *>(eptr); // NOT OK
    Person *p = reinterpret_cast<Person *>(eptr);
    return 0;
}

int main1()
{
    Base *bptr = new Derived();                   // upcasting
    Derived *dptr = static_cast<Derived *>(bptr); // Downcasting
    return 0;
}
