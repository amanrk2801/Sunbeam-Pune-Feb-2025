#include<iostream>
using namespace std;


/*
class Demo
{
    private: // data hiding
    int num1;
    int num2;
    public:
    void accept();
    void disp();
};

//defining the class function outside the class
// SCOPE RESOULTION OPERATOR 

void Demo::accept()
{
    cout<<"Enter First Number :";
    cin>>num1;
    cout<<"Enter Second Number :";
    cin>>num2;
}

void Demo::disp()
{
    cout<<"Num1 :"<<num1<<" Num2 "<<num2<<endl;
}

int main(void)
{
    Demo d1;
    d1.accept();
    d1.disp();

    return 0;
}

*/


/*
// declare data members as private
// declare member functions as public

//if we wish to access the private data members of class
// solution is access it through the member function of the class 


class Demo
{
    //class  : code + data togther (Encapsulation) 
    private: // data hiding
    int num1;
    int num2;
    public:
    void accept()
    {
        cout<<"Enter First Number :";
        cin>>num1;
        cout<<"Enter Second Number :";
        cin>>num2;
    }
    void disp()
    {
        cout<<"Num1 :"<<num1<<" Num2 "<<num2<<endl;
    }
};

int main(void)
{
    Demo d1; //d1 is object of the class
    d1.accept();
    d1.disp();

    Demo d2;
    //d2.num1=50;
    //d2.num2=40;
    d2.accept();
    d2.disp();

    Demo d3;
    //d3.num1=200;
    //d3.num2=150;
    d3.accept();
    d3.disp();

    //cout<<"\n modyfying d3 data through d2"; // not allowed
    //d3.num1=d2.num1; //not allowed 
    //d3.disp();


    return 0;
}

*/