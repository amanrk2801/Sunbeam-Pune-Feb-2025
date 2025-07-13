#include <iostream>
using namespace std;

class Shape
{
    virtual void calculateArea()
    {
    }
};

class Circle : public Shape
{
};

class Rectangle : public Shape
{
    void calculateArea()
    {
    }
    void calculatePerimeter()
    {
    }
};

int main()
{
    // Shape *shape = new Shape();
    Shape *shape = new Rectangle();
    // Shape *shape = new Circle();
    cout << typeid(shape).name() << endl;
    cout << typeid(*shape).name() << endl;

    if (typeid(*shape) == typeid(Rectangle))
        cout << "Runtime object created is Rectangle - " << endl;
    else
        cout << "Runtime object created is Other than Rectangle - " << endl;

    return 0;
}
