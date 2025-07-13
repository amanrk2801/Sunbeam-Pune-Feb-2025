#include <iostream>
using namespace std;

template <class T>
class Array
{
private:
    int size;
    int index;
    T *ptr;

public:
    Array(int size)
    {
        this->size = size;
        this->index = 0;
        ptr = new T[size];
    }

    void addElement(T element)
    {
        if (index < size)
        {
            ptr[index] = element;
            index++;
        }
        else
            cout << "Array is Full - " << endl;
    }

    T getElement(int i)
    {
        return ptr[i];
    }

    int length()
    {
        return index;
    }

    ~Array()
    {
        delete[] ptr;
        ptr = NULL;
    }
};

int main()
{
    Array<int> a1(5);
    a1.addElement(10);
    a1.addElement(20);
    a1.addElement(30);
    a1.addElement(40);
    a1.addElement(50);

    for (int i = 0; i < a1.length(); i++)
        cout << "element = " << a1.getElement(i) << endl;

    Array<double> a2(5);
    a2.addElement(10.11);
    a2.addElement(20.12);
    a2.addElement(30.13);
    a2.addElement(40.14);
    a2.addElement(50.15);

    for (int i = 0; i < a2.length(); i++)
        cout << "element = " << a2.getElement(i) << endl;

    Array<char> a3(5);
    a3.addElement('A');
    a3.addElement('B');
    a3.addElement('C');

    for (int i = 0; i < a3.length(); i++)
        cout << "element = " << a3.getElement(i) << endl;

    return 0;
}