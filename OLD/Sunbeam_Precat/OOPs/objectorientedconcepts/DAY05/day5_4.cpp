#include<iostream>
using namespace std;
class Point
{
    public:
    int x;
    int y;
    Point()
    {
        this->x=5;
        this->y=5;
    }
    Point(int x,int y)
    {
        this->x=x;
        this->y=y;
    }
    void disp()
    {
        cout<<" X : "<<this->x<<" Y : "<<this->y<<endl;
    }
};

// p3 = p1 + p2  // compiler will search for operator+()
// p3 = operator+(p1,p2) 
// + is binary operator
// operator+() written in global area
// operator+() will take two arguments

Point operator+(Point &pt1,Point &pt2)
{
    Point temp;
    temp.x=pt1.x+pt2.x;
    temp.y = pt1.y + pt2.y;
    return temp;
}

int main(void)
{
    Point p1;
    Point p2(10,40);
    Point p3;
    p1.disp();
    p2.disp();
    p3=p1+p2; // need to add two objects ( extend the meaning of + operator)
    p3.disp();
    return 0;

}