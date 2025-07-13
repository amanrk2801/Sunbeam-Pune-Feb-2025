#include <iostream>
using namespace std;

class Test
{
    // private:
public:
    // non constant
    int num1;
    // mutable int num1;

    // constant
    const int num2;

public:
    // const data members must be initialized in ctor members initializer list
    Test(int n1, int n2) : num2(n2)
    {
        num1 = n1;
        // we cannot initialize the const data members inside the ctor body
        // num2 = n2;
    }

    // we cannot write mutators for const data members
    // void setNum2(int value)
    // {
    //     num2 = value;
    // }

    // We can write inspectors for const data members
    int getNum2() const
    {
        return num2;
    }

    // we cannot make mutators as constant
    void setNum1(int num1)
    {
        // const Time *const this;
        this->num1 = num1;
    }

    // we can make all the Inspectors as constant
    int getNum1() const
    {
        return num1;
    }

    void displayTest() const
    {
        // if you want to change the value of non const datamembers
        // inside the const member functions then declare
        // such data members as mutable.
        // num1 = 100;
        cout << "Num1 = " << num1 << endl;
        cout << "Num2 = " << num2 << endl;
    }
};

int main()
{
    Test t1(10, 20);
    t1.displayTest();
    t1.setNum1(100);
    t1.num1 = 100;
    t1.num2 = 200;

    const Test t2(100, 200);
    t2.displayTest();
    // t2.setNum1(1000); // Not Allowed
    t2.num1 = 100;
    t2.num2 = 200;

    return 0;
};