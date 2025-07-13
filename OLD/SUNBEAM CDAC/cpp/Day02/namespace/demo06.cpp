#include <iostream>
namespace na
{
    int num1 = 10;
    int num2 = 20;

    // nested namespace
    namespace nb
    {
        int num2 = 30;
        int num4 = 40;
    }
}

int main()
{
    printf("na num1  -%d \n", na::num1);     // 10
    printf("na num2  -%d \n", na::num2);     // 20
    printf("nb num2  -%d \n", na::nb::num2); // 30
    printf("nb num4  -%d \n", na::nb::num4); // 40
    return 0;
}