#include<iostream>
using namespace std;
class A
{
    public:
    int a;
};
class B:public A
{
    public:
    int b;
};
class C:public A
{
    public:
    int c;
};
class D: public B,public C
{
    public:
    int d;
};

int main(void)
{
    D dobj;
    //dobj.d=10;
    //cout<<dobj.d;
    //dobj.b=20;
    //dobj.c=30;
    //cout<<"b : "<<dobj.b<<" c : "<<dobj.c<<endl;

    //dobj.a=50; //error: request for member 'a' is ambiguous (diamond problem)
    dobj.B::a=50;
    cout<<dobj.B::a<<endl;
    dobj.C::a=60;
    cout<<dobj.C::a;
    return 0;
}