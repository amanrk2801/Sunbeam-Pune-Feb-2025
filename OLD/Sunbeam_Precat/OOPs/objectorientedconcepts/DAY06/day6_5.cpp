#include<iostream>
using namespace std;

//Early binding concept
class Base
{
    public:
    void show()
    {
        cout<<"Inside class A Show function"<<endl;
    }
};
class Derived:public Base
{
    public:
    void show()
    {
        Base::show(); //this will give a call to base class overridden function
        cout<<"Inside class B Show function"<<endl;
    }
};

int main(void)
{
    Base *ptr; // creating base class pointer object
    Derived dobj;
    ptr=&dobj; // pointer is holding address of derived class object
    ptr->show(); //always base class function gets called 
    return 0;
}