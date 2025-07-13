#include <iostream>
using namespace std;

int main()
{
    // int size;
    //  todo take input from user for size of 2D array allocated dynamically
    int **arr = new int *[2];
    arr[0] = new int[2];
    arr[1] = new int[2];

    arr[0][0] = 10;
    arr[0][1] = 20;
    arr[1][0] = 30;
    arr[1][1] = 40;

    for (int row = 0; row < 2; row++)
    {
        for (int col = 0; col < 2; col++)
        {
            cout << arr[row][col] << ",";
        }
        cout << endl;
    }
    cout << endl;

    delete[] arr[0];
    delete[] arr[1];
    delete[] arr;

    arr = NULL;

    cout << "Completed" << endl;

    return 0;
}