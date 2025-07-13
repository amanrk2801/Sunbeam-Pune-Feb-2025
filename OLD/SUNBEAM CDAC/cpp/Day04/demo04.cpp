#include <iostream>
using namespace std;

class Test
{
    int num1;
    static int num2;

public:
    Test()
    {
        num1 = 10;
        // num2 = 20;
    }

    Test(int num1, int num2)
    {
        this->num1 = num1;
        this->num2 = num2;
    }

    void displayTest() // this
    {
        cout << "num1 = " << num1 << endl;
        cout << "num2 = " << num2 << endl;
    }

    // do not get *this
    static void displayNum2()
    {
        // we cannot access non static data members
        // cout << "num1 = " << num1 << endl; // NOT OK;

        // Test t;
        // cout << "Num1 = " << t.num1 << endl; // ALLOWED

        cout << "Num2 = " << num2 << endl;
    }
};
// static data members should be initialized outside the class
int Test::num2 = 1000;

int main()
{
    // static member functions are designed to call on classname using ::
    Test::displayNum2();

    Test t1;
    t1.displayNum2();
    return 0;
}