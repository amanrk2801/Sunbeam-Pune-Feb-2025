#include <iostream>
using namespace std;

class Point
{
    int xaxis;
    int yaxis;

public:
    Point()
    {
        xaxis = 1;
        yaxis = 1;
    }
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
    // Point p1;
    // p1.displayPoint();

    Point *ptr = new Point;
    ptr->displayPoint();
    delete ptr;
    ptr = NULL;
    return 0;
}

int main1()
{
    // int *ptr = (int *)malloc(sizeof(int) * 1);

    // int *ptr = new int;
    //*ptr = 10;

    int *ptr = new int(10);

    cout << "Value at *ptr = " << *ptr << endl;

    // free(ptr);
    delete ptr;
    ptr = NULL;
    return 0;
}