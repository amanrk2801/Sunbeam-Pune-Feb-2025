#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // Parameterized Constructor
    Point(int x, int y)
    {
        cout << "Inside Constructor" << endl;
        xaxis = x;
        yaxis = y;
        cout << "Constructor called for - ";
        displayPoint();
    }

    void displayPoint()
    {
        cout << "Point (" << xaxis << "," << yaxis << ")" << endl;
    }

    // Destructor
    ~Point()
    {
        cout << "Inside Destructor" << endl;
        cout << "Destructor called for - ";
        displayPoint();
    }
};

int main()
{
    Point p1(2, 3); // Parameterized ctor

    // Explicit call to Ctor
    // p1.Point(5, 6); // NOT OK

    // Explicit call to Dtor
    p1.~Point();
    return 0;
}

int main1()
{
    Point p1(2, 3); // Parameterized ctor
    Point p2(4, 5); // Parameterized ctor
    return 0;
}