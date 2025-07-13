#include<iostream>
using namespace std;





namespace na
{
    int num1=25;
}

int main(void)
{
    using namespace na;
   cout<<num1; 
   cout<<"some code";
   cout<<"some more lines";
   cout<<num1;
   cout<<"some code";
   cout<<"some more lines";
   cout<<num1;
    return 0;
}


/*
namespace na
{
    int num1=25;
}

int main(void)
{
   cout<<na::num1; 
   cout<<"some code";
   cout<<"some more lines";
   cout<<na::num1;
   cout<<"some code";
   cout<<"some more lines";
   cout<<na::num1;
    return 0;
}

*/