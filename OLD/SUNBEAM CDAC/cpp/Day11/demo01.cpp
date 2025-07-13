#include <iostream>
using namespace std;

class Test
{
private:
    int num;

public:
    Test()
    {
        cout << "Inside parameterless Ctor - " << endl;
        num = 10;
    }
    Test(int n)
    {
        cout << "Inside parameterized Ctor - " << endl;
        num = n;
    }

    void setNum(int n)
    {
        num = n;
    }
    int getNum()
    {
        return num;
    }
};

int main()
{
    Test t1; // Parmeterless -> t1.Test();
    cout << "Value of t1 - " << t1.getNum() << endl;

    Test t2(100); // Parmeterized ->t2.Test(100);
    cout << "Value of t2 - " << t2.getNum() << endl;

    Test t3 = t2; // Default Copy Ctor -> Shallow copy -> t3.Test(t2)
    cout << "Value of t3 - " << t3.getNum() << endl;

    t2.setNum(50);
    cout << "Value of num after changed by t2 - " << endl;
    cout << "Value of t2 - " << t2.getNum() << endl;
    cout << "Value of t3 - " << t3.getNum() << endl;

    return 0;
}