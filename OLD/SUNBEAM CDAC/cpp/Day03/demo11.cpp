#include <iostream>
using namespace std;

class BankAccount
{
private:
    const int accno;
    string name;
    double balance;

public:
    BankAccount(int accno, string name, double balance) : accno(accno)
    {
        this->name = name;
        this->balance = balance;
    }

    double getBalance() const
    {
        return balance;
    }

    // can i make the deposit function const?
    void deposit() const
    {
        // todo
    }

    // can i make the deposit function const?
    void withdraw()
    {
        // todo
    }

    void displayAccountDetails() const
    {
        cout << "Accno - " << accno << endl;
        cout << "Name - " << name << endl;
        cout << "Balance - " << balance << endl;
    }
};

int main()
{
    BankAccount acc1(1001, "rohan", 10000);
    acc1.displayAccountDetails();

    return 0;
}