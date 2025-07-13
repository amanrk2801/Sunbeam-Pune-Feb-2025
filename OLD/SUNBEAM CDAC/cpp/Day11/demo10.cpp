#include <iostream>
using namespace std;

// gloabl variable
int num3 = 30;

// static global variable
static int num4 = 40;

int main()
{
    // local variable
    int num2 = 20;

    // static local variable
    static int num5 = 50;

    // Local class
    // a class defined inside function is called as local class
    class Local
    {
    private:
        int num1 = 10;
        // declaration  of static members is not allowed
        // static int num6; // NOT OK

    public:
        void displayLocal()
        {
            cout << "Inside Local class display" << endl;
            cout << num1 << num2 << num3 << num4 << num5 << endl;
        }
    };

    Local l1;
    l1.displayLocal();
    return 0;
}

/*
Q.what can be accessed inside local class?
-> global,static global and static  local variables.

Q. can we define static data member inside local class
-> no

Q. can we create object of local class outside the function.
-> no, the object can be created only witin the function in which it is
declared
*/