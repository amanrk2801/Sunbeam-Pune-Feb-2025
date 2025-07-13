#include <iostream>
using namespace std;

// abstract class
// we cannot create object of abstract class
class Shape // Base
{
public:
    // pure virtual functions
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
    void f1()
    {
        cout << "f1" << endl;
    }
};

class Circle : public Shape // Derived
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

class Square : public Shape // Derived
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
            delete sptr;
            sptr = NULL;
        }
    } while (choice != 0);

    return 0;
}

int main2()
{
    Shape *sptr = new Rectnagle(); // upcasting
    sptr->acceptData();            // Late Binding
    sptr->calculateArea();         // Late Binding
    delete sptr;
    sptr = NULL;
    return 0;
}
int main1()
{
    Circle c;
    c.acceptData();
    c.calculateArea();

    Rectnagle r;
    r.acceptData();
    r.calculateArea();
    return 0;
}