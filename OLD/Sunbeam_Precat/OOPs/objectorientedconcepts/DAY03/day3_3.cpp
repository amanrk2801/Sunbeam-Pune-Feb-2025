#include<iostream>
using namespace std;

class Demo
{
    int num1;
    int num2;
    public:
    // Member functions
    // 1. Constructor ( Used to initialize the elements of class )
    // It is sepcial member function of class
    // Its name is same as class name , it does not have any return type
    // it gets called automatically whenver we create object
    Demo() // Parameter less constructor / user defined default constuctor
    {
        cout<<"Inisde parameterless constructor "<<this<<endl;
        this->num1=10;
        this->num2=10;
    }
    Demo(int num1,int num2) // paramatrized constructor 
    {
        cout<<"inside  paramatrized constructor "<<this<<endl;
        this->num1=num1;
        this->num2=num2;
    }

    //Destructor 
    ~Demo()
    {
        cout<<"Inisde desctructor "<<this<<endl;
    }
    void disp()
    {
        cout<<" Num1 :"<<this->num1<<" Num2 :"<<this->num2<<" Current Obj Address "<<this<<endl;
    }
};

int main(void)
{
    Demo d; // call to parameterlss constructor will be given 
    // constructor will be called automatically whenver we create object
    //d.num1=0;//not allowed
    //d.num2=0;  // not allowed
    d.disp(); // disp() is called upon d object

    Demo d1(50,40);// This will call paramatrized constructor 
    d1.disp();
    return 0;
}

//if one class contains more than one constructor
// constructor overloading