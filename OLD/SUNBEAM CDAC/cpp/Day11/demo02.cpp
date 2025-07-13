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
        *numptr = t.getNum();
    }

    void setNum(int n)
    {
        *numptr = n;
    }
    int getNum()
    {
        return *numptr;
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

    Test t3 = t2; // Copy Ctor -> Deep copy -> t3.Test(t2)
    cout << "Value of t3 - " << t3.getNum() << endl;

    t2.setNum(50);
    cout << "Value of num after changed by t2 - " << endl;
    cout << "Value of t2 - " << t2.getNum() << endl;
    cout << "Value of t3 - " << t3.getNum() << endl;

    return 0;
}