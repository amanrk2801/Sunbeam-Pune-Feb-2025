#include <iostream>
using namespace std;

// single dimension array of pointers
int main()
{
    int *arr[5];
    arr[0] = new int(10);
    arr[1] = new int(20);
    arr[2] = new int(30);
    arr[3] = new int(40);
    arr[4] = new int(50);

    for (int i = 0; i < 5; i++)
    {
        cout << *arr[i] << ",";
    }
    cout << endl;

    for (int i = 0; i < 5; i++)
    {
        delete arr[i];
        arr[i] = NULL;
    }
    return 0;
}

// single dimenstion array created dynamically
int main2()
{
    int *arrptr = new int[5]{10, 20, 30, 40, 50};
    // arrptr[0] = 10;
    //  .
    //  .
    //  .

    for (int i = 0; i < 5; i++)
    {
        cout << arrptr[i] << ",";
    }
    cout << endl;
    delete[] arrptr;
    arrptr = NULL;
    return 0;
}

// single dimensional array
int main1()
{
    // int arr[5] = {10, 20, 30, 40, 50};
    int arr[] = {10, 20, 30, 40, 50};

    // int arr[5];
    // arr[0] = 10;
    // .
    // .
    // .

    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << ",";
    }
    cout << endl;

    return 0;
}