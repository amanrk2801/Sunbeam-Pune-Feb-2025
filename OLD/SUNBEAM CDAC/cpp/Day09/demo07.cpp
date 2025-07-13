#include <iostream>
using namespace std;
// template <typename T>
template <class X, class Y>
class Point
{
private:
    X x;
    Y y;

public:
    Point(X x, Y y)
    {
        this->x = x;
        this->y = y;
    }

    void displayPoint()
    {
        cout << "Point - (" << x << "," << y << ")" << endl;
    }
};
int main()
{
    Point<int, int> p1(1, 1);
    p1.displayPoint();

    Point<double, double> p2(1.5, 3.2);
    p2.displayPoint();

    Point<char, char> p3('A', 'B');
    p3.displayPoint();

    Point<int, char> p4(1, 'A');
    p4.displayPoint();

    Point<char, double> p5('B', 11.22);
    p5.displayPoint();
    return 0;
}