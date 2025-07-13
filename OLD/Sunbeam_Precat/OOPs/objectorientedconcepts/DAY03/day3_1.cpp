#include<iostream>
using namespace std;

void print(int a=100,int b=200,int c=300,int d=400);

int main(void)
{
   print(1,2,3,4);
   print(1,2,3);
   print(1,2);
  print(1);
  print();
    return 0;
}

void print(int a,int b,int c,int d)
{
    cout<<"A : "<<a<<" B : "<<b<<" C: "<<c<<" D : "<<d<<endl;
}

