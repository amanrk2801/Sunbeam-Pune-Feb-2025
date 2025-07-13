#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    Point() : Point(1) {}

    Point(int value) : Point(value, value) {}

    Point(int xaxis, int yaxis)
    {
        this->xaxis = xaxis;
        this->yaxis = yaxis;
    }

    void displayPoint()
    {
        cout << "Point (" << xaxis << "," << yaxis << ")" << endl;
    }
};

int main()
{
    Point p1(2, 3); // parameterized
    p1.displayPoint();

    Point p2(2); // single parameterized
    p2.displayPoint();

    Point p3; // parameterless
    p3.displayPoint();

    return 0;
}