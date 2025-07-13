#include <iostream>
using namespace std;

class Shape
{
public:
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
};

class Circle : public Shape
{
private:
    int radius;

public:
    void acceptData()
    {
        cout << "Enter radius - ";
        cin >> radius;
    }
    void calculateArea()
    {
        cout << "Area of Circle - " << 3.14 * radius * radius << endl;
    }
};

class Square : public Shape
{
private:
    int side;

public:
    void acceptData()
    {
        cout << "Enter side - ";
        cin >> side;
    }
    void calculateArea()
    {
        cout << "Area of Square - " << side * side << endl;
    }
};

class Rectnagle : public Shape
{
private:
    int length;
    int breadth;

public:
    void acceptData()
    {
        cout << "Enter length and breadth - ";
        cin >> length >> breadth;
    }
    void calculateArea()
    {
        cout << "Area of Rectangle - " << length * breadth << endl;
    }
    void calculatePerimeter()
    {
        cout << "Perimeter of Rectangle - " << 2 * (length + breadth) << endl;
    }
};

int main()
{
    int choice;
    Shape *sptr = NULL;
    do
    {
        cout << "0. EXIT" << endl;
        cout << "1. Rectangle Area" << endl;
        cout << "2. Circle Area" << endl;
        cout << "3. Square Area" << endl;
        cout << "Enter choice - ";
        cin >> choice;

        switch (choice)
        {
        case 0:
            cout << "Thank you.." << endl;
            break;
        case 1:
            sptr = new Rectnagle();
            break;
        case 2:
            sptr = new Circle();
            break;
        case 3:
            sptr = new Square();
            break;

        default:
            cout << "Wrong choice.." << endl;
            break;
        }
        if (sptr != NULL)
        {
            sptr->acceptData();
            sptr->calculateArea();

            if (typeid(*sptr) == typeid(Rectnagle))
            {
                Rectnagle *rectnagle = (Rectnagle *)sptr; // Downcasting
                rectnagle->calculatePerimeter();
            }

            delete sptr;
            sptr = NULL;
        }
    } while (choice != 0);

    return 0;
}
