#include <iostream>
using namespace std;

class A
{
public:
    int num1;

    A()
    {
        cout << "A::A()" << endl;
        num1 = 10;
    }
};

class B : virtual public A
{
public:
    int num2;
    B()
    {
        cout << "B::B()" << endl;
        num2 = 20;
    }
};

class C : virtual public A
{
public:
    int num3;
    C()
    {
        cout << "C::C()" << endl;
        num3 = 30;
    }
};

class D : public B, public C
{
public:
    int num4;
    D()
    {
        cout << "D::D()" << endl;
        num4 = 40;
    }
    void displayD()
    {
        cout << num1 << num2 << num3 << num4 << endl;
    }
};

int main()
{
    A obj1;
    cout << "size of A class Obj - " << sizeof(obj1) << endl;
    B obj2;
    cout << "size of B class Obj - " << sizeof(obj2) << endl;
    C obj3;
    cout << "size of C class Obj - " << sizeof(obj3) << endl;
    D obj4;
    cout << "size of D class Obj - " << sizeof(obj4) << endl;

    return 0;
}
