#include <iostream>
using namespace std;

void division(int numerator, int denominator)
{
    if (denominator == 0)
        throw 2; // int -> It generates an exception of type int

    int result = numerator / denominator;
    cout << "Division - " << result << endl;
}

int main()
{
    try
    {
        division(10, 0);
        cout << "Inside try after division() call - " << endl;
    }
    catch (int error)
    {
        cout << "Denominator cannot be 0" << endl;
    }

    cout << "Program Execution Completed " << endl;
    return 0;
}