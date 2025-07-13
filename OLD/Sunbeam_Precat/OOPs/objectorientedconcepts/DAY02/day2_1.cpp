#include<iostream>
using namespace std;


//scope resolution operator :: 
// 1. used to access global variable 
// ::variablename


int val=50; // val is global variable
int main(void)
{
    int val=40; // val is local variable 
    cout<<"Local Variable " <<val<<endl; //endl : end line ('\n')
    cout<<"Global Variable :"<<::val;
    return 0;
}