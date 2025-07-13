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
    void f2()
    {
        cout << "Base::f2()" << endl;
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
        cout << "Derived::f2()" << endl;
    }

    void f3()
    {
        cout << "Derived::f3()" << endl;
    }
};

int main()
{
    Base *bptr = new Derived();
    bptr->f1();
    bptr->f2(); // Base::f2() -> Early Binding
    Derived *dptr = (Derived *)bptr;
    dptr->f1();
    dptr->f2(); // Derived::f2()-> Early Binding
    dptr->f3();

    delete bptr;
    bptr = NULL;
    dptr = NULL;

    return 0;
}
