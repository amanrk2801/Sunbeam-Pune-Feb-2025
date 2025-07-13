#include <iostream>
using namespace std;
// Logical entity
class Time
{
private:
    // Data Members
    int hrs;
    int mins;

public:
    // Member Funtions
    void acceptTime() // Time *const this
    {
        cout << "Enter Hrs and Mins - ";
        cin >> this->hrs >> mins;
    }
    void displayTime() // Time *const this
    {
        cout << "Time - " << hrs << " : " << this->mins << endl;
    }
};

int main()
{
    Time t1;         // object
    t1.acceptTime(); // acceptTime(&t1)
    t1.displayTime();

    Time t2;
    t2.acceptTime();
    t2.displayTime();

    // int num1;
    // cout << "Enter value for num1 - ";
    // cin >> num1;
    // cout << "Value of num1 = " << num1 << endl;
    return 0;
}