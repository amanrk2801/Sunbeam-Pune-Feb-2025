#include <iostream>
using namespace std;

enum EMenu
{
    EXIT,
    CREATE_ACCOUNT,
    DISPLAY_ACCOUNT_DETAILS,
    DISPLAY_BALANCE,
    DEPOSIT,
    WITHDRAW
};

int main()
{
    int choice;
    do
    {
        cout << "0. EXIT" << endl;
        cout << "1. Create Account" << endl;
        cout << "2. Display Account Details" << endl;
        cout << "3. Show Balance" << endl;
        cout << "4. Deposit" << endl;
        cout << "5. Withdraw" << endl;
        cout << "Enter your choice - ";
        cin >> choice;
        switch (EMenu(choice))
        {
        case EXIT:
            cout << "Thank you.." << endl;
            break;
        case CREATE_ACCOUNT:
            break;
        case DISPLAY_ACCOUNT_DETAILS:
            break;
        case DISPLAY_BALANCE:
            break;
        case DEPOSIT:
            break;
        case WITHDRAW:
            break;
        default:
            cout << "wrong choice..." << endl;
            break;
        }
    } while (choice != 0);
    return 0;
}