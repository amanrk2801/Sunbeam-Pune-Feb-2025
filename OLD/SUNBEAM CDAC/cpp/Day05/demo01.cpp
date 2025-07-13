#include <iostream>
using namespace std;

class BankAccount
{
private:
    const int accno;
    string name;
    double balance;
    int generate_accno = 1000; // generate accno automatically

public:
    BankAccount() : accno(++generate_accno) {}

    void acceptaccountDeatils()
    {
        cout << "Enter name - ";
        cin >> name;
        cout << "Enter initial Balance - ";
        cin >> balance;
    }

    void displayAccountDeatils()
    {
        cout << "Accno = " << accno << endl;
        cout << "Name = " << name << endl;
        cout << "Balanace = " << balance << endl;
    }
};

// int BankAccount::generate_accno = 1000;

int main()
{
    BankAccount acc1; // Parameterless
    acc1.displayAccountDeatils();

    BankAccount acc2; // Parameterless
    acc2.displayAccountDeatils();

    BankAccount acc3;
    acc3.displayAccountDeatils();
}
