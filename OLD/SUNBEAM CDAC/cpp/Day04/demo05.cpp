#include <iostream>
using namespace std;

class Circle
{
private:
    double radius;
    static const double PI = 3.14;

public:
    Circle(double radius)
    {
        this->radius = radius;
    }

    void calculateArea()
    {
        cout << "Area of circle = " << PI * radius * radius << endl;
    }
};
// initialization
const double Circle::PI = 3.14;

int main()
{
    Circle c1(5);
    c1.calculateArea();

    Circle c2(7);
    c2.calculateArea();
}