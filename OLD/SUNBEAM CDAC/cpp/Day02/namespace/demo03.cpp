#include <iostream>

int num1 = 10;

namespace na
{
    int num1 = 20;
}

int main()
{
    int num1 = 30;
    printf("global num1  -%d \n", ::num1); // 10
    printf("na num1  -%d \n", na::num1);   // 20
    printf("local num1  -%d \n", num1);    // 30
    return 0;
}