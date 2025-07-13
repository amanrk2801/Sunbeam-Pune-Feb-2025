#include <iostream>
namespace na
{
    int num1 = 10;
    int num2 = 20;
}
namespace na
{
    int num3 = 30;
    int num4 = 40;
}

int main()
{
    printf("na num1  -%d \n", na::num1); // 10
    printf("na num2  -%d \n", na::num2); // 20
    printf("nb num2  -%d \n", na::num2); // 20
    printf("nb num3  -%d \n", na::num3); // 30
    return 0;
}