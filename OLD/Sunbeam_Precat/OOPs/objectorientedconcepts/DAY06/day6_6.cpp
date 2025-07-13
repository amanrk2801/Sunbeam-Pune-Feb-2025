#include<iostream>
using namespace std;

//LATE binding concept
class Base
{
    public:
    virtual void show()
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
    ptr->show();  // this is giving call to derived class overridden function
    return 0;
}


//if we wish to give a call to overridden function with the help of base class pointer
//we need to declare those functions as virtual