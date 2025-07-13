#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // function to initialize the point obj with deafult values.
    void initPoint()
    {
        xaxis = 1;
        yaxis = 1;
    }

    void initPoint(int x, int y)
    {
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
    Point p1;
    p1.initPoint();
    p1.displayPoint();

    Point p2;
    p2.initPoint();

    Point p3;
    p3.initPoint();

    p2.displayPoint();
    p3.displayPoint();

    Point p4;
    // enter x and y value
    p4.initPoint(2, 4);

    p4.displayPoint();
    return 0;
}