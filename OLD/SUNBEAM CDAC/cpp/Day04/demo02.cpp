#include <iostream>
using namespace std;

void swap(int &n1, int &n2)
{
    int temp = n1;
    n1 = n2;
    n2 = temp;
}

int main()
{
    int n1 = 10;
    int n2 = 20;
    cout << "Before swap - " << endl;
    cout << "n1 = " << n1 << ",";
    cout << "n2 = " << n2 << endl;

    swap(n1, n2);

    cout << "After swap - " << endl;
    cout << "n1 = " << n1 << ",";
    cout << "n2 = " << n2 << endl;

    // int &ref; // NOT OK
    int &ref = n1;
    //&ref = n2; // not ok

    // int *const ptr = &n1;
    // ptr = &n2; // not ok
    return 0;
}