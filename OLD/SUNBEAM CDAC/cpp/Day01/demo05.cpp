#include <iostream>

// Take the input for Time and display it

// Encapsulation
struct Time
{
    // members
    int hrs;
    int mins;

    // members
    void acceptTime()
    {
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
    printf("Defining functions inside struct - \n");

    // Abstraction
    struct Time t1;

    t1.acceptTime();
    t1.displayTime();
    return 0;
}
