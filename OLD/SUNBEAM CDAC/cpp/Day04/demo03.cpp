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
        num2 = 20; // assign
    }

    Test(int num1, int num2)
    {
        this->num1 = num1;
        this->num2 = num2; // assign
    }

    void displayTest()
    {
        cout << "num1 = " << num1 << endl;
        cout << "num2 = " << num2 << endl;
    }
};
// >static data members should be initialized outside the class
int Test::num2 = 1;

int n1 = 100;

int main()
{
    Test t1;
    cout << "size of t1 = " << sizeof(t1) << endl;

    Test t2(100, 200);
    cout << "size of t2 = " << sizeof(t2) << endl;

    t1.displayTest(); // 10,200
    t2.displayTest(); // 100,200

    return 0;
}