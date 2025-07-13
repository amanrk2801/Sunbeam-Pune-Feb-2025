#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // Parameterless constructor
    Point()
    {
        cout << "Inside Parameterless Constructor" << endl;
        xaxis = 1;
        yaxis = 1;
    }

    // Parameterized Constructor
    Point(int x, int y)
    {
        cout << "Inside Parameterized Constructor" << endl;
        xaxis = x;
        yaxis = y;
    }

    void displayPoint()
    {
        cout << "Point (" << xaxis << "," << yaxis << ")" << endl;
    }
};

int main()
{
    Point p1;       // Parameterless
    Point p2;       // Parameterless
    Point p3;       // Parameterless
    Point p4(2, 4); // Parameterized

    p1.displayPoint();
    p2.displayPoint();
    p3.displayPoint();
    p4.displayPoint();

    return 0;
}