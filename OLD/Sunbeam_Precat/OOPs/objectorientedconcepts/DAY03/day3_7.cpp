#include<iostream>
using namespace std;

// const keyword with member function of the class 

//if we wish to modify some data members inside const member function
//then those data members can be declared with keyword called as 'mutable'
class Test
{
    int a; // non constant data member
    const int b; // constant data member
    mutable int m;
    public:
    Test():a(5),b(10),m(20){}

    // if we declare any member function as constant 
    //then we can not change the value of constant as well as non constant data member
    void disp() const // constant member function
    {
        cout<<" A : "<<a<<" B :"<<b<<" M : "<<m<<endl;
        //a++; // not allowed
       // b++; not allowed
       //  cout<<" A : "<<a<<" B :"<<b<<endl;
       m++;
       cout<<" A : "<<a<<" B :"<<b<<" M : "<<m<<endl;
    }

};
int main(void)
{
    Test t;
    t.disp();
    return 0;
} 




