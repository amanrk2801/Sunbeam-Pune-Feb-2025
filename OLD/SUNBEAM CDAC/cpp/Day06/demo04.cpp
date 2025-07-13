#include <iostream>
using namespace std;

class Parent // Base
{
private:
    int num1;
    int num2;
    // static int num2;

public:
    Parent()
    {
        cout << "Inside Parent Ctor" << endl;
        num1 = 10;
        num2 = 20;
    }

    void displayParent()
    {
        cout << "Num1 - " << num1 << endl;
        cout << "Num2 - " << num2 << endl;
    }

    ~Parent()
    {
        cout << "Inside Parent Dtor - " << endl;
    }
};

class Child : Parent // Derived
{
private:
    int num3;

public:
    Child()
    {
        cout << "Inside Child Ctor - " << endl;
        num3 = 30;
    }
    void displayChild()
    {
        this->displayParent();
        cout << "Num3 - " << num3 << endl;
    }
    ~Child()
    {
        cout << "Inside Child Dtor - " << endl;
    }
};

int main()
{
    // Parent p;
    Child c;
    //  cout << "size of parent class - " << sizeof(p) << endl; // 8
    //  cout << "size of child class - " << sizeof(c) << endl;  // 12
    return 0;
}