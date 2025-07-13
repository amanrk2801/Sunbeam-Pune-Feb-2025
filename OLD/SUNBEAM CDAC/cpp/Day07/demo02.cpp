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

    // ~Base()
    // {
    //     cout << "Base::~Base()" << endl;
    // }
};

class Dervied : public Base
{
public:
    Dervied()
    {
        cout << "Dervied::Dervied()" << endl;
    }

    void f3()
    {
        cout << "Derived::f3()" << endl;
    }

    // ~Dervied()
    // {
    //     cout << "Dervied::~Dervied()" << endl;
    // }
};

int main()
{
    Dervied d;
    d.f1();
    d.f2();
    d.f3();
    return 0;
}
