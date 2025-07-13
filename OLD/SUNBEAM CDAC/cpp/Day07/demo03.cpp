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

    void f3()
    {
        cout << "Derived::f3()" << endl;
    }
};

int main()
{

    Base *bptr = new Derived();
    bptr->f1();
    bptr->f2();
    // bptr->f3();//NOT OK // object slicing

    Derived *dptr = (Derived *)new Base(); // downcasting
    dptr->f3();
}

int main1()
{
    Base *bptr = new Base();
    bptr->f1();
    bptr->f2();

    Derived *dptr = new Derived();
    dptr->f1();
    dptr->f2();
    dptr->f3();

    delete bptr;
    delete dptr;
    bptr = NULL;
    dptr = NULL;
    return 0;
}
