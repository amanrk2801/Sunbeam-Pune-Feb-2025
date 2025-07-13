#include<iostream>
#include<iomanip> // input output manipulation
using namespace std; 

int main(void)
{
    int num1=4000;
    int num2=500;
    int n=32;
    int val=600;
    //printf("%7d %7d ",num1,num2);
    cout<<setw(7)<<num1<<setw(7)<<num2;
     cout<<"\n Fill : "<<setw(10)<<setfill('$')<<val;
    printf("\n %d %x %o \n",n,n,n);
    cout<<setbase(10)<<n<<" "<<setbase(16)<<n<<" "<<setbase(8)<<n;
   

    return 0;
}