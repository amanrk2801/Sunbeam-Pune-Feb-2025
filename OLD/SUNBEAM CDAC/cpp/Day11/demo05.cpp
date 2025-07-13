#include <iostream>
using namespace std;

class Student
{
private:
    int rollno;
    string name;
    double marks;

public:
    Student() {}
    friend void operator>>(istream &in, Student &s1);
    friend void operator<<(ostream &out, Student &s1);
};

void operator>>(istream &in, Student &s1)
{
    cout << "Enter rollno -" << endl;
    in >> s1.rollno;
    cout << "Enter name -" << endl;
    in >> s1.name;
    cout << "Enter marks -" << endl;
    in >> s1.marks;
}

void operator<<(ostream &out, Student &s1)
{
    out << "Rollno - " << s1.rollno << endl;
    out << "Name - " << s1.name << endl;
    out << "Marks - " << s1.marks << endl;
}

int main()
{
    Student s1;
    cin >> s1;  //  operator>>(cin,s1)
    cout << s1; // operator<<(cout,s1)
    return 0;
}