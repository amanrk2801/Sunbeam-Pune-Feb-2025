#include<iostream>
using namespace std;

class Test
{
    int num1;
    int num2;
    public:
    //construtor member initailizer list
    Test():num1(5),num2(5){}
    //Test()
    //{
      //  this->num1=5;
        //this->num2=5;
    //}
   // Test(int n1,int n2):num1(n1),num2(n2){}
    void disp()
    {
        cout<<" Num1 :"<<num1<<" Num2 :"<<num2;
    }
};

int main(void)
{
    Test tobj;
    tobj.disp();
    return 0;
}