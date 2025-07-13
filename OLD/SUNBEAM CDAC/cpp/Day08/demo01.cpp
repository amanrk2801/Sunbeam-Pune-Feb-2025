#include <iostream>
using namespace std;

class Shape
{
public:
    Shape()
    {
        cout << "Shape()" << endl;
    }
    virtual ~Shape()
    {
        cout << "~Shape()" << endl;
    }
};

class Rectangle : public Shape
{
    int *length, *breadth;

public:
    Rectangle()
    {
        cout << "Rectangle()" << endl;
    }
    ~Rectangle()
    {
        cout << "~Rectangle()" << endl;
    }
};

int main()
{

    Shape *sptr = new Rectangle();
    delete sptr;
    sptr = NULL;
    return 0;
}

int main1()
{

    Rectangle *rptr = new Rectangle();
    delete rptr;
    rptr = NULL;
    return 0;
}