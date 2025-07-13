#include <iostream>
using namespace std;

class Test
{
private:
    int num1;

public:
    Test()
    {
        num1 = 10;
    }
    void f1() const
    {
        num1 = 100; // NOT OK
        cout << "Inside f1() - " << num1 << endl;
    }
    void f2() const // const Test *const this;
    {
        const_cast<Test *const>(this)->num1 = 1000; // NOT OK
        cout << "Inside f2() - " << num1 << endl;
    }
    void f3() // Test *const this;
    {
        this->num1 = 20;
    }
};

int main()
{
    Test t1;
    t1.f2(); // f2(&t1);
    t1.f3();
    return 0;
}