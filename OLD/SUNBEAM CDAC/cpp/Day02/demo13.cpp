#include <iostream>
using namespace std;

// void add(int n1, int n2) // 2
// {
//     cout << "Addition = " << n1 + n2 << endl;
// }

// // function overloading
// void add(int n1, int n2, int n3) // 3
// {
//     cout << "Addition = " << n1 + n2 + n3 << endl;
// }

// function overloading
// Default Argument Function
void add(int n1, int n2, int n3 = 0, int n4 = 0) // 4
{
    cout << "Addition = " << n1 + n2 + n3 + n4 << endl;
}

int main()
{
    add(10, 20);
    add(10, 20, 30);
    add(10, 20, 30, 40);
    return 0;
}