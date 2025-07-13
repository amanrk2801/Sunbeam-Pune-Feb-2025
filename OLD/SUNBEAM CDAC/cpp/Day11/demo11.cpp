#include <iostream>
using namespace std;

int num2 = 20;
static int num3 = 30;

class Outer
{
private:
    int num4;
    static int num5;

public:
    class Nested
    {
    private:
        int num1;
        static int num6;

    public:
        void displayNested()
        {
            // own members
            cout << num1 << num6 << endl;

            // global scope members
            cout << num2 << num3 << endl;

            Outer o1;
            // outer class members
            cout << o1.num4 << num5 << endl;
        }
    };

    void displayOuter()
    {

        // own members
        cout << num4 << num5 << endl;
        Nested n1;
        // nested class members
        cout << n1.num1 << Nested::num6 << endl;
    }
};

int main()
{
    Outer o1;
    Outer::Nested n1;
    return 0;
}

/*
Q. What can we access in nested class ?
-> own data memebrs, global and static global variables and static
data members of outer class.

Q. can we access non static data member of outer class inside Nested class?
-> Yes, By creating outer class object inside Nested class.

Q. Can we access datamemebrs of nested class in outer class?
-> We can access public non static members of nested class by creating nested class object
public static members of nested class can be accessed directly using classname and ::
*/