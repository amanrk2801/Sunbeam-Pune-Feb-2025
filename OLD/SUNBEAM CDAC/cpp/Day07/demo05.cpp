#include <iostream>
using namespace std;

class Base
{
public:
    Base()
    {
        cout << "Base::Base()" << endl;
    }
    void f1()
    {
        cout << "Base::f1()" << endl;
    }
    virtual void f2()
    {
        cout << "Incomplete Base::f2()" << endl;
    }
};

class Derived : public Base
{
public:
    Derived()
    {
        cout << "Derived::Derived()" << endl;
    }

    // function overriding
    void f2()
    {
        cout << "Complete Derived::f2()" << endl;
    }

    void f3()
    {
        cout << "Derived::f3()" << endl;
    }
};

int main()
{
    Base *bptr = new Derived(); // upcasting

    bptr->f2(); // Derived::f2() -> Late Binding

    Derived *dptr = (Derived *)bptr;
    dptr->f2(); // Derived::f2()->

    delete bptr;
    bptr = NULL;
    dptr = NULL;

    return 0;
}
