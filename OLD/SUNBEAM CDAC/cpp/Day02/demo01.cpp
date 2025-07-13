#include <iostream>

// Logical entity
class Time
{
    // Data Members
    int hrs;
    int mins;
    int seconds;
    static int id;

    // Member Funtions
    void acceptTime()
    {
        // todo
    }
    void displayTime()
    {
        // todo
    }
};

class Empty
{
    int num1;
};

int main()
{
    // physical entity
    Time t1; // Object
    printf("Size of t1 - %ld\n", sizeof(t1));

    Empty e1;
    printf("Size of e1 - %ld\n", sizeof(e1));

    return 0;
}