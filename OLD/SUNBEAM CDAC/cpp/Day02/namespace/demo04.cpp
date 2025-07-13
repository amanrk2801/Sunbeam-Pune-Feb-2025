#include <iostream>
namespace na
{
    int num1 = 10;
    int num2 = 20;
}
namespace nb
{
    int num2 = 200;
    int num3 = 30;
}

int main()
{
    printf("na num1  -%d \n", na::num1); // 10
    printf("na num2  -%d \n", na::num2); // 20
    printf("nb num2  -%d \n", nb::num2); // 200
    printf("nb num3  -%d \n", nb::num3); // 30
    return 0;
}