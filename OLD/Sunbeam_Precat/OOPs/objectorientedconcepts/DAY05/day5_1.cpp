#include<iostream>
using namespace std;

class Test
{
    int n1,n2;
    public:
    Test()
    {
        this->n1=10;
        this->n2=20;
    }
    void disp()
    {
        cout<<"N1 :"<<this->n1<<" N2 : "<<this->n2<<endl;
    }
    static void print() // static member function / class methods 
    {
        //n1=20; 
        //n2=30; // non static members can not be accessed within static member functions

        cout<<"Inside static print function";
    }
};

int main(void)
{
    Test tobj;
    tobj.disp(); //disp() is called upon tobj
    //disp(); // not allowed
    //Test::disp(); // not allowed 

    Test::print(); 
    return 0;
}
