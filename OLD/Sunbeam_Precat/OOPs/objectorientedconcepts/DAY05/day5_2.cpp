#include<iostream>
using namespace std;

//n1 = 4  n2 = 2 n1/n2  = 4/2 =2
// n1 = 4  n2 = 0   4/0  Not possible 


/*

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
        //throw 1; //it throws one object (1 is of type int )
        //throw 'A';
        throw 4.2f;
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

    }
    catch(char ch)
    {
        cout<<"inside char catch block  Second number is zero";
    }
    // generic catch block
    catch(...)
    {
        cout<<"Inside generic block : one of the field is zero";
    }
    return 0;
}

*/