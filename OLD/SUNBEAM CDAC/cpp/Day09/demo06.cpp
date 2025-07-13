#include <iostream>
using namespace std;

// template <class T>
template <typename T>
void myswap(T &o1, T &o2)
{
    T temp = o1;
    o1 = o2;
    o2 = temp;
}

int main()
{
    // int var1 = 11;
    // int var2 = 33;
    // double var1 = 11.22;
    // double var2 = 33.44;

    char var1 = 'A';
    char var2 = 'B';

    cout << "Before swap - " << endl;
    cout << "var1 - " << var1 << ", "
         << "var2 - " << var2 << endl;

    // myswap<int>(var1, var2);
    // myswap<double>(var1, var2);
    myswap<char>(var1, var2);

    cout << "After swap - " << endl;
    cout << "var1 - " << var1 << ", "
         << "var2 - " << var2 << endl;

    return 0;
}