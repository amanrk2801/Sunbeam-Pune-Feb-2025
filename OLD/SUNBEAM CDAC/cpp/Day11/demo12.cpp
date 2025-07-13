#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    string name = "Rohan";
    cout << setw(10) << name << endl;
    cout << setfill('*') << setw(10) << name << endl;
    cout << setfill('*') << setw(10) << left << name << endl;
    cout << setfill('*') << setw(10) << right << name << endl;
    return 0;
}

int main3()
{
    double num1 = 1234.1234;
    cout << "num1 - " << setprecision(2) << fixed << num1 << endl;
    return 0;
}

int main2()
{
    int num1 = 10;
    cout << "num1 - " << num1 << endl;
    cout << "hex num1 - " << setbase(16) << num1 << endl;
    cout << "oct num1 - " << setbase(8) << num1 << endl;
    return 0;
}

int main1()
{
    int num1 = 10;
    cout << "num1 - " << num1 << endl;
    cout << "hex num1 - " << hex << num1 << endl;
    cout << "oct num1 - " << oct << num1 << endl;
    return 0;
}