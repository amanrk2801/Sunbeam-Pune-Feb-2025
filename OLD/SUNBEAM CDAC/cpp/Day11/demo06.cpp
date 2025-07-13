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

    Test t2(20); // Parmeterized ->t2.Test(100);
    cout << "Value of t2 - " << t2.getNum() << endl;

    t1 = t2; // shallow copy -> Default Asignment Operator
    cout << "Value of t1 - " << t1.getNum() << endl;

    t2.setNum(40);
    cout << "Value of num after changed by t2 - " << endl;
    cout << "Value of t2 - " << t2.getNum() << endl;
    cout << "Value of t1 - " << t1.getNum() << endl;

    return 0;
}