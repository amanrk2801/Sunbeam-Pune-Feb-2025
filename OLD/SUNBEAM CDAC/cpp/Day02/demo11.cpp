#include <iostream>
using namespace std;

void add()
{
    int num1, num2;
    cout << "enter num1 and num2 value for addition - ";
    cin >> num1 >> num2;
    cout << "Addition of  num1 + num2 = " << num1 + num2 << endl;
}

void sub()
{
    int num1, num2;
    cout << "enter num1 and num2 value for substraction - ";
    cin >> num1 >> num2;
    cout << "Substraction of  num1 - num2 = " << num1 - num2 << endl;
}

void mul()
{
    int num1, num2;
    cout << "enter num1 and num2 value for multiplication - ";
    cin >> num1 >> num2;
    cout << "Multiplication of  num1 * num2 = " << num1 * num2 << endl;
}

int menu()
{
    int choice;
    cout << "0. EXIT" << endl;
    cout << "1. Addition" << endl;
    cout << "2. Substraction" << endl;
    cout << "3. Multiplication" << endl;
    cout << "Enter your choice - ";
    cin >> choice;
    return choice;
}

int main()
{
    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            add();
            break;
        case 2:
            sub();
            break;
        case 3:
            mul();
            break;
        default:
            cout << "Invalid Choice ... " << endl;
            break;
        }
    }
    cout << "Thank you..." << endl;
    return 0;
}