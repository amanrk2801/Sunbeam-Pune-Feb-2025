#include<iostream>
using namespace std;

//call by value
void swap_by_value(int a,int b); // swap_by_val is taking two arguments of type int
//call by address
void swap_by_add(int *a,int *b); // swap_by_add is taking two arguments of type int pointer
//call by reference 
void swap_by_ref(int &a,int &b); // swap_by_ref is taking two arguments of type reference

int main(void)
{
    int n1=20,n2=5;
    //cout<<"Before SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;
    //swap_by_value(n1,n2);
    //cout<<"After SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;

    //cout<<"Before SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;
    //swap_by_add(&n1,&n2);
    //cout<<"After SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;

    cout<<"Before SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;
    swap_by_ref(n1,n2);
    cout<<"After SWAP N1 : "<<n1<<" N2 :"<<n2<<endl;

    return 0;
}

void swap_by_value(int a,int b)
{
    int temp;
    temp=a;
    a=b;
    b=temp;
}
void swap_by_add(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

 //swap_by_ref(n1,n2);
 // int &a = n1    int &b = n2

void swap_by_ref(int &a,int &b)
{
    int temp;
    temp=a;
    a=b;
    b=temp;
}