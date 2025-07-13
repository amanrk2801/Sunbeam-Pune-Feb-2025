#include<iostream>
using namespace std;
#include"emp.h"
int main(void)
{
    Employee e1;
    Employee e2(30,60000);
    Employee e3;
    e3.accept();
    e1.disp();
    e2.disp();
    e3.disp();

    return 0;
}