#include <iostream>
using namespace std;

int main()
{
    int num1 = 10;
    const int *const ptr = &num1;
    num1 = 20;
    //*ptr = 200; // Not Allowed
    return 0;
}

int main5()
{
    int num1 = 10;
    int num2 = 20;
    const int *ptr = &num1;
    num1 = 100;
    ptr = &num2;

    //*ptr = 200;//Not Allowed
    return 0;
}

int main4()
{
    const int num1 = 10;
    const int num2 = 20;
    const int *const ptr = &num1;
    //*ptr = 100;  // Not Allowed
    // ptr = &num2; // Not Allowed
    return 0;
}

int main3()
{
    const int num1 = 10;
    const int num2 = 20;
    // int *ptr = &num1; // NOT Allowed

    // const int *ptr = &num1; // Allowed
    int const *ptr = &num1; // Allowed

    //*ptr = 100;             // NOT Allowed
    ptr = &num2; // Allowed
    return 0;
}

int main2()
{
    int num1 = 10;
    int num2 = 20;
    int *const ptr = &num1;
    // ptr = &num2; // NOT Allowed
    *ptr = 100;
    return 0;
}

int main1()
{
    // const int num1 = 10;
    int const num1 = 10;
    // num1 = 20; // NOT OK
    return 0;
}