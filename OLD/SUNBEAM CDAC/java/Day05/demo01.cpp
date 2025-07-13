#include <iostream>
using namespace std;

class Singleton
{
private:
    // step-3
    static Singleton *ptr;
    int *n1;

    // Step-1
    Singleton()
    {
        cout << "Inside Ctor" << endl;
    }

public:
    // step-2
    static Singleton *getInstance()
    {
        // step-4
        if (ptr == NULL)
            ptr = new Singleton();
        return ptr;
    }
};
Singleton *Singleton::ptr = NULL;

int main()
{
    Singleton *ptr1 = Singleton::getInstance();
    Singleton *ptr2 = Singleton::getInstance();
    Singleton *ptr3 = Singleton::getInstance();
    Singleton *ptr4 = Singleton::getInstance();
    delete ptr4;
    return 0;
}