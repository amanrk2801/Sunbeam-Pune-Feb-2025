#include <iostream>

int num1 = 10;

int main()
{

    int num1 = 20;
    printf("global num1  -%d \n", ::num1);
    printf("local num1  -%d \n", num1);
    return 0;
}