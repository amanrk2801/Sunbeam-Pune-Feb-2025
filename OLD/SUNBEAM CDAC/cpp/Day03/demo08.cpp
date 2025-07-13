#include <iostream>

using namespace std;

class Point
{
private:
    int xaxis;
    int yaxis;

public:
    // constructor
    Point()
    {
        xaxis = 1;
        yaxis = 1;
    }

    // Muatator-> Setters
    void setXaxis(int value) //
    {
        xaxis = value;
    }

    // Inspector -> getters
    int getXaxis()
    {
        return this->xaxis;
    }

    // facilitators
    // functions that contains any type of operations
    // or functions that constains business logic
    void displayPoint() //
    {
        cout << "x = " << xaxis << endl;
        cout << "y = " << yaxis << endl;
    }

    ~Point()
    {
    }
};

int main()
{
    Point p1;
    p1.displayPoint();

    // p1.xaxis = 5; // NOT OK
    p1.setXaxis(5);

    // cout << "Changed value of p1.xaxis - " << p1.xaxis << endl; // NOT OK
    cout << "Changed value of p1.xaxis - " << p1.getXaxis() << endl;

    return 0;
}