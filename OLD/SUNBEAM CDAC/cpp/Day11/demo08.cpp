#include <iostream>
using namespace std;

class Time
{
private:
    int hrs;
    int mins;

public:
    Time()
    {
        cout << "Inside Parameterless" << endl;
        hrs = 10;
        mins = 10;
    }

    // conversion function
    Time(int value)
    {
        cout << "Inside Single Parameterized" << endl;
        this->hrs = value / 60;
        this->mins = value % 60;
    }

    Time(int hrs, int mins)
    {
        cout << "Inside Parameterized" << endl;
        this->hrs = hrs;
        this->mins = mins;
    }
    void diplayTime()
    {
        cout << "Time - " << hrs << ":" << mins << endl;
    }

    // conversion function
    operator int()
    {
        int result = hrs * 60 + mins;
        return result;
    }
};

int main()
{
    // Time t1; // Parameterless
    // t1.diplayTime();

    // Time t2(11, 20); // Parameterized
    // t2.diplayTime();

    // int mins = 130;
    //  Time t3(mins);
    //  t3.diplayTime();

    // int mins = 130;
    // Time t4;   // Parameterless
    // t4 = mins; // t4.Time(mins) -> Conversion Function
    // t4.diplayTime();

    Time t5(11, 31); // Parameterized
    int mins = t5;   // conversion function
    cout << "T5 converted to mins = " << mins << endl;

    return 0;
}
