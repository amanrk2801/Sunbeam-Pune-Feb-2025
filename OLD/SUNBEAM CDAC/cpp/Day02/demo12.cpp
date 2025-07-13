#include <iostream>
using namespace std;

void add(int n1, int n2) // (int,int) ->2 -->add_i_i_2
{
    cout << "Addition = " << n1 + n2 << endl;
}

// function overloading
void add(double n1, double n2) //->2  (double,double) -->add_d_d_2
{
    cout << "Addition = " << n1 + n2 << endl;
}

// function overloading
void add(int n1, int n2, int n3) //-> 3 (int,int,int)
{
    cout << "Addition of 3 nos = " << n1 + n2 + n3 << endl;
}

// function overloading
int add(int n1, double n2) // (int,double)
{
    cout << "Addition of 1st int and 2nd double no = " << n1 + n2 << endl;
}

// function overloading
void add(double n1, int n2) // (double,int)
{
    cout << "Addition of 1st double and 2nd int no = " << n1 + n2 << endl;
}
int main()
{
    add(10, 20);
    add(10.11, 20.22);
    add(10, 20, 30);
    add(10, 10.11);
    add(10.12, 10);

    return 0;
}