#include<iostream>
using namespace std;
int main(void)
{
    int n1,n2;
    int res;
    cout<<"Enter First Number :";
    cin>>n1;
    cout<<"Enter Second Number :";
    cin>>n2;
    try
    {
        if(n2==0)
        throw 1; //it throws one object (1 is of type int )
        else
        {
            res=n1/n2;
            cout<<"Result :"<<res;
        }
    }
    catch(int a)
    {
        //corrective actions
        cout<<"Second Number value is zero";
        n2=1;
        cout<<"\n Considering n2 is 1 ";
        cout<<"\n Result :"<<n1/n2;


    }
    return 0;
}