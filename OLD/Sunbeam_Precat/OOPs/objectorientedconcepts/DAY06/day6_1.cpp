#include<iostream>
using namespace std;
class B; // Forward Declaration
class A
{
    private:
    int num1;
    public:
    A()
    {
        this->num1=5;
    }
    A(int num1)
    {
        this->num1=num1;
    }
    friend void sum(A aobj,B bobj);
};
class B
{
    private:
    int num2;
    public:
    B()
    {
        this->num2=20;
    }
    B(int num2)
    {
        this->num2=num2;
    }
    friend void sum(A aobj,B bobj);
}; 

void sum(A aobj,B bobj)
{
    int res=aobj.num1+bobj.num2;
    cout<<" Addition :"<<res;
}
int main(void)
{
    A a1; 
    B b1; 
    sum(a1,b1);
    A a2(50);
    B b2(25);
    sum(a2,b2);
    return 0;
}
