#include<iostream>
using namespace std;

class Complex
{
    int real;
    int imag;
    public:
    Complex()
    {
        this->real=5;
        this->imag=5;
    }
    Complex(int real,int imag)
    {
        this->real=real;
        this->imag=imag;
    }

    //Complex c3(c2)
    //this= c3     Complex &obj = c2
    // Copy constructor takes reference of object of same class
    Complex(Complex &obj) // copy constructor 
    {
        this->real=obj.real;
        this->imag=obj.imag;
    }
    void disp()
    {
        cout<<"Real Value :"<<this->real<<" Imag : "<<this->imag<<endl;
    }
};

int main(void)
{
    Complex c1;    // this = c1
    Complex c2(20,25); // this = c2 
    Complex c3(c2);  // this = c3 
    // paramatrized constructor 
    // as a argument we have passed another object  
    c1.disp();
    c2.disp();
    c3.disp();

    return 0;
}