#include<iostream>
using namespace std;

// const keyword with data members
class Test
{
    int num; // non constant data member
    const int c; // constant data member 

    //if we wish to initialize the data members of class
    //Constructor
    // if we wish to initialize constant data members of class
    //we need to have compulsory constructor member initializer list
    public:
    Test():num(10),c(5){}
    void disp()
    {
        cout<<"Num : "<<num<<" Value of C :"<<c<<endl;
    }

};
int main()
{
    Test tobj;
    tobj.disp();
    return 0;
}



/*
//const keyword
int main(void)
{
    const int num=5;
    cout<<"Value of num :"<<num<<endl;
   // num++; //error: increment of read-only variable 'num'
    //cout<<"Value of num :"<<num<<endl;
    return 0;
}

*/