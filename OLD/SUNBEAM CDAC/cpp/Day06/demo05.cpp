#include <iostream>
using namespace std;

class Base // Parent
{
private:
    int num1;

public:
    int num2;

protected:
    int num3;

public:
    Base()
    {
        cout << "Inside Base Ctor" << endl;
        num1 = 10;
        num2 = 20;
        num3 = 30;
    }

    void displayBase()
    {
        cout << "Num1 - " << num1 << endl;
        cout << "Num2 - " << num2 << endl;
        cout << "Num3 - " << num3 << endl;
    }

    ~Base()
    {
        cout << "Inside Base Dtor - " << endl;
    }
};

class Derived : Base // Child (Mode of inheritance here is private)
{
private:
    int num4;

public:
    Derived()
    {
        cout << "Inside Derived Ctor - " << endl;
        num4 = 40;
    }
    void displayDerived()
    {
        cout << "Num1 - " << num1 << endl; // NOT OK
        cout << "Num2 - " << num2 << endl; // OK
        cout << "Num3 - " << num3 << endl; // OK
        cout << "Num4 - " << num4 << endl;
    }
    ~Derived()
    {
        cout << "Inside Derived Dtor - " << endl;
    }
};

int main()
{
    // Base b;
    // cout << b.num1 << endl; // NOT OK
    // cout << b.num2 << endl; // OK
    // cout << b.num3 << endl; // NOT OK
    Derived d;
    // d.displayDerived();
    return 0;
}