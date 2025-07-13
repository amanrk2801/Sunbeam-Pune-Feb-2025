#include <iostream>

// Function Declaration
void add(int n1, int n2);

int main()
{
    add(10, 20);
    return 0;
}

// Function Defination/Implementation
void add(int n1, int n2)
{
    printf("Addition = %d\n", n1 + n2);
}
