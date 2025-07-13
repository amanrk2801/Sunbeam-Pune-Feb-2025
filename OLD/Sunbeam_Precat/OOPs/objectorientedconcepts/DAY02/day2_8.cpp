#include<iostream>
using namespace std;

//function name is same , but it is taking different number of arguments
// Function Overloading
// Polymorphisim (Compile time polymorphisim)

void disp();
void disp(int a);
void disp(int a,int b);
void disp(float f1,float f2);
int main(void)
{
    disp();
    disp(10);
    disp(20,50);
    disp(4.5f,3.6f);
    return 0;
}

void disp()
{
    cout<<"Inside Disp Function "<<endl;
}
void disp(int a)
{
    cout<<" Inside int a block "<<a<<endl;
}
void disp(int a,int b)
{
    cout<<" Inside int,int  block "<<a<<"\t"<<b<<endl;
}
void disp(float f1,float f2)
{
    cout<<" Inside flaot float  block "<<f1<<"\t"<<f2<<endl;
}