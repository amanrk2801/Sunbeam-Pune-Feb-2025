#include <iostream>
using namespace std;

class Point
{
    int x;
    int y;

public:
    Point()
    {
        x = 1;
        y = 1;
    }
    Point(int x, int y)
    {
        this->x = x;
        this->y = y;
    }
    void displayPoint()
    {
        cout << "Point (" << x << "," << y << ")" << endl;
    }
};

int main()
{
    Point *arr = new Point[5]{Point(1, 2), Point(2, 3), Point(3, 4), Point(4, 5), Point(5, 6)};

    for (int i = 0; i < 5; i++)
        arr[i].displayPoint();

    delete[] arr;
    return 0;
}