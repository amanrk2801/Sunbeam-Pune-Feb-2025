#include <iostream>

// Take the input for Time and display it

struct Time
{
    int hrs;
    int mins;
};

void acceptTime(struct Time *tptr)
{
    printf("Enter hrs and mins - ");
    scanf("%d%d", &tptr->hrs, &tptr->mins);
}

void displayTime(struct Time t)
{
    printf("Time - %d : %d\n", t.hrs, t.mins);
}

int main()
{
    printf("Using CPP - \n");
    struct Time t1;
    // acceptTime(t1); // pass by value
    acceptTime(&t1);
    displayTime(t1);
    return 0;
}
