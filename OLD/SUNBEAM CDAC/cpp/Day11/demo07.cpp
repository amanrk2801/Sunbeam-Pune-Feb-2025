#include <iostream>
using namespace std;

class Test
{
private:
    int *numptr;

public:
    Test()
    {
        cout << "Inside parameterless Ctor - " << endl;
        numptr = new int;
        *numptr = 10;
    }
    Test(int n)
    {
        cout << "Inside parameterized Ctor - " << endl;
        numptr = new int;
        *numptr = n;
    }
    Test(Test &t)
    {
        cout << "Inside Copy Ctor - " << endl;
        numptr = new int;
        *numptr = t.getNum(); //deep copy
    }

    void setNum(int n)
    {
        *numptr = n;
    }
    int getNum()
    {
        return *numptr;
    }

    void operator=(Test &t2) // this-> t1
    {
        *numptr = t2.getNum();
    }

    ~Test()
    {
        delete numptr;
        numptr = NULL;
    }
};

int main()
{
    Test t1; // Parmeterless -> t1.Test();
    cout << "Value of t1 - " << t1.getNum() << endl;

    Test t2(20); // Parmeterized ->t2.Test(20);
    cout << "Value of t2 - " << t2.getNum() << endl;

    t1 = t2; // Assignment -> t1.operator=(t2)
    cout << "Value of t1 - " << t1.getNum() << endl;

    t2.setNum(40);
    cout << "Value of num after changed by t2 - " << endl;
    cout << "Value of t2 - " << t2.getNum() << endl;
    cout << "Value of t1 - " << t1.getNum() << endl;

    return 0;
}