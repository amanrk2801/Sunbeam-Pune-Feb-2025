#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    Point()
    {
        xaxis = 1;
        yaxis = 1;
    }

    Point(int value)
    {
        xaxis = value;
        yaxis = value;
    }
    //          2  ,     3
    Point(int xaxis, int yaxis)
    {
        this->xaxis = xaxis; // 2
        this->yaxis = yaxis; // 3
    }

    void acceptPoint()
    {
        cout << "Enter xaxis and yaxis value - ";
        cin >> xaxis >> yaxis;
    }

    void displayPoint()
    {
        cout << "Point (" << xaxis << "," << yaxis << ")" << endl;
    }
};

int main()
{
    Point p1; // Parameterless
    p1.displayPoint();

    Point p2(2); // Parameterized
    p2.displayPoint();

    Point p3(2, 3);
    p3.displayPoint();
    return 0;
}