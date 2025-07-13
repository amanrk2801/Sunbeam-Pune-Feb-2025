#include <iostream>
using namespace std;

class Shape
{
public:
    virtual void calculateArea() = 0;
};

class Circle : public Shape
{
public:
    void calculateArea()
    {
    }
};

class Rectangle : public Shape
{
public:
    void calculateArea()
    {
    }
    void calculatePerimeter()
    {
    }
};

int main()
{
    Shape *shape = new Circle(); // upcasting
    shape->calculateArea();

    // Rectangle *rectangle = (Rectangle *)shape;
    Rectangle *rectangle = dynamic_cast<Rectangle *>(shape);
    if (rectangle != NULL)
        cout << "Do the work" << endl;
    else
        cout << "Downcasting failed" << endl;

    return 0;
}
