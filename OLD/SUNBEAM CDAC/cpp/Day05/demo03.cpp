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
    Point *arr[5];
    arr[0] = new Point;
    arr[1] = new Point(2, 3);
    arr[2] = new Point(3, 4);
    arr[3] = new Point;
    arr[4] = new Point(4, 5);

    for (int i = 0; i < 5; i++)
        arr[i]->displayPoint();

    for (int i = 0; i < 5; i++)
    {
        delete arr[i];
        arr[i] = NULL;
    }
    return 0;
}