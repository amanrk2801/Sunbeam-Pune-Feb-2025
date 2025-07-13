#include <iostream>

struct Time
{

private:
    // members
    int hrs;
    int mins;

public:
    // members
    void acceptTime()
    {
        // logs
        printf("Enter hrs and mins - ");
        scanf("%d%d", &hrs, &mins);
    }

    void displayTime()
    {
        printf("Time - %d : %d\n", hrs, mins);
    }
};

int main()
{
    struct Time t1;
    t1.acceptTime();
    t1.displayTime();
    // t1.hrs = 20; -> error
    // t1.mins = 40; -> error
    return 0;
}
