#include <iostream>
using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // // Parameterless constructor
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
    int choice;
    Point p1;
    while (true)
    {

        cout << "1. Accept data for Point" << endl;
        cout << "2. Display Data for Point" << endl;
        cin >> choice;
        if (choice == 1)
        {
            p1.acceptPoint();
        }
        else if (choice == 2)
        {
            p1.displayPoint();
        }
    }
    return 0;
}

int main1()
{
    Point p1(2, 3); // parameterized
    p1.displayPoint();

    Point p2; // parameterless
    p2.displayPoint();

    return 0;
}