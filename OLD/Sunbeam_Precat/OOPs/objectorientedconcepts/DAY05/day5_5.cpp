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


    //p3=p1+p2
    //p3 = p1.operator+(p2);
    // operator+() is called upon p1 object. So we can say current object address
    //this* will be given to p1 and &other will hold p2 object address 
    Point operator+(Point &other)
    {
        Point temp;
        temp.x=this->x + other.x;
        temp.y=this->y+other.y;
        return temp;
    }

};
int main(void)
{
    Point p1(50,20);
    Point p2(10,40);
    Point p3;
    p1.disp(); //disp() is called upon p1 object (this* p1)
    p2.disp();
    p3=p1+p2; // need to add two objects ( extend the meaning of + operator)
    p3.disp();
    return 0;

}


/*

p4= p1+p2+p3
p4= p1.operator+(p2)  + p3
p4 = temp              + p3
p4= temp.operator+(p3)
p4=temp;
*/