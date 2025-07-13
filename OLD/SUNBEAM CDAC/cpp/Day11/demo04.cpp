#include <iostream>
using namespace std;

class Matrix
{
private:
    int arr[2][2];

public:
    Matrix()
    {
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
    }

    Matrix(int n1, int n2, int n3, int n4)
    {
        arr[0][0] = n1;
        arr[0][1] = n2;
        arr[1][0] = n3;
        arr[1][1] = n4;
    }

    void display()
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
                cout << arr[i][j] << "\t";
            cout << endl;
        }
        cout << endl;
    }

    // Matrix add(Matrix m2) // m1 -> this
    // {
    //     Matrix result;
    //     for (int i = 0; i < 2; i++)
    //         for (int j = 0; j < 2; j++)
    //             result.arr[i][j] = this->arr[i][j] + m2.arr[i][j];
    //     return result;
    // }

    Matrix operator+(Matrix m2) // m1 -> this
    {
        Matrix result;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result.arr[i][j] = this->arr[i][j] + m2.arr[i][j];
        return result;
    }
};

int main()
{
    Matrix m1; // Parametrless
    m1.display();

    Matrix m2(2, 3, 4, 5); // parameterized
    m2.display();

    // Matrix result = m1.add(m2); // m1.add(m2);
    Matrix result = m1 + m2; // m1.operator+(m2);
    result.display();

    return 0;
}