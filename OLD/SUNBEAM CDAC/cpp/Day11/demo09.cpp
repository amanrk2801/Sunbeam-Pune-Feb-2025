#include <iostream>
using namespace std;

class Vector
{
private:
    int arr[50];
    int index = 0;

public:
    Vector()
    {
    }
    void pushBack(int element)
    {
        arr[index] = element;
        index++;
    }
    int size()
    {
        return index;
    }

    int &operator[](int i)
    {
        return arr[i];
    }
};
int main()
{
    Vector v1;
    v1.pushBack(10);
    v1.pushBack(20);
    v1.pushBack(30);
    v1[0] = 100;

    for (int i = 0; i < v1.size(); i++)
    {
        cout << v1[i] << endl; // v1.operator[](i)
    }
}