#include <iostream>
using namespace std;

int main()
{
    int arr[2][2];
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

    return 0;
}