#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // if you want to initialize the data members in the same sequence
    // as their declaration then use constructor members initializer list

    // constructor members initializer list
    Point(int value) : yaxis(++value), xaxis(value)
    {
        // the body will initaize the members as per the
        //  initializations given by the user

        //  xaxis = value;
        //  yaxis = ++value;
    }

    void displayPoint()
    {
        cout << "Point (" << xaxis << "," << yaxis << ")" << endl;
    }
};

int main()
{
    Point p1(2);
    p1.displayPoint();

    return 0;
}