#include<iostream>
using namespace std;
//static


class Test
{
    public:
    static void sum(int num1,int num2) //static member function / class member function
    {
        cout<<"Addition :"<<num1+num2<<endl;
    }
};
int main(void)
{
   // Test tobj;
    //tobj.sum(30,25); //sum() is called upon tobj
    // Requirement is , need to call sum() without object name 
    Test::sum(40,25);

    return 0;

}


/*
// 1. static data member 

class Test
{
    int num; //non static data member 
    static int s;   // static data member  (data section)
    public:
    Test()
    {
        this->num=10;
    }
    void disp()
    {
        cout<<" Num :"<<num<<" S :"<<s<<endl;
    }
    void change()
    {
        s+=30; // s=s+30;
    }
};
// If we wish to initialize static data member 
//they must be initialized outside the class 
// using scope resolution operator 
int Test::s=50;

int main(void)
{
    Test t1;
    t1.disp(); //10  50  
    Test t2;
    t2.disp(); //10  50 
    t2.change();
    t2.disp(); // 10   80
    t1.disp(); // 10   80

    return 0;
}

*/