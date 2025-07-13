#include <iostream>
using namespace std;

class A
{
private:
    int n1;

protected:
    int n2;

public:
    void displayA()
    {
        cout << n1 << n2 << endl;
    }

    friend void myfun();
    friend class B;
};

class B
{
public:
    void displayB()
    {
        A obj;
        cout << obj.n1 << obj.n2 << endl;
    }
};

void myfun()
{
    A obj;
    cout << obj.n1 << obj.n2 << endl;
}

int main()
{

    return 0;
}