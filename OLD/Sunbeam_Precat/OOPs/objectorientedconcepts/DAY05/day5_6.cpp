#include<iostream>
using namespace std;

template<class T> // use template and T : Type parameter

void swap_num(T &o1,T &o2)
{
    T temp;
    temp=o1;
    o1=o2;
    o2=temp;
}

int main(void)
{
    int n1=10,n2=5;
    float f1=5.3,f2=4.6;
    cout<<"Before : "<<n1<<"\t"<<n2<<endl;
    swap_num<int>(n1,n2);
    // specifying the type parameter at the time of function call
    // Function Template 
    cout<<"After : "<<n1<<"\t"<<n2<<endl;
     cout<<"Before : "<<f1<<"\t"<<f2<<endl;
    swap_num<float>(f1,f2);
    cout<<"After : "<<f1<<"\t"<<f2<<endl;
    return 0;
}

