#include<iostream>
using namespace std;
// if function signature /prototype is same in different scope
// FUNCTION OVERRIDING
// POLYMORPHISIM : RUN TIME POLYMORPHISIM
class A
{
    public:
    void show()
    {
        cout<<"Inside class A Show function"<<endl;
    }
};
class B:public A
{
    public:
    void show()
    {
        A::show(); //this will give a call to base class overridden function
        cout<<"Inside class B Show function"<<endl;
    }
};

int main(void)
{
    B bobj;
    bobj.show();
    return 0;
}