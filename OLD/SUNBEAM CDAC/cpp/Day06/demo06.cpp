#include <iostream>
using namespace std;
class A
{
private:
    int num1;

protected:
    int num2;

public:
    int num3;

    A()
    {
        num1 = 10;
        num2 = 20;
        num3 = 30;
    }

    void displayA()
    {
        cout << num1 << num2 << num3 << endl;
    }
};

class B : public A // Mode of inheritance
{
    int num4;

public:
    B()
    {
        num4 = 40;
    }
    void displayB()
    {
        // num1 is not accessiable directly
        cout << num1 << num2 << num3 << num4 << endl;
    }
};

class C : public B
{
    int num5;

public:
    C()
    {
        num5 = 50;
    }

    void displayC()
    {
        cout << num1 << num2 << num3 << num4 << num5 << endl;
    }
};
int main()
{
    A a;
    cout << a.num1 << a.num2 << a.num3 << endl; // only public are accessiable

    B b;
    cout << b.num1 << b.num2 << b.num3 << b.num4 << endl; // only public are accessiable

    C c;
    cout << c.num3 << endl;

    c.displayA();
    c.displayB();
    c.displayC();
    return 0;
}