#include<iostream>
using namespace std;

class Test
{
    int num1;
    int num2;
    public:
    //void set(int n1,int n2)
    //{
      //  num1=n1;
        //num2=n2;
    //}

    void set(int num1,int num2)
    {
        cout<<"Current Object addres inside set "<<this<<endl;
        this->num1=num1;
        this->num2=num2;
    }
    void disp()
    {
        cout<<"Current Object addres inside set "<<this<<endl;
        cout<<"Num1 :"<<num1<<" Num2 : "<<num2<<endl;
    }
};

int main(void)
{
    Test dobj;
    dobj.set(30,20);//set() is called upon dobj (this (dobj address will get stored))
    dobj.disp();
    return 0;
}