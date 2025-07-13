#include "person.h"

Person::Person()
{
    cout << "Person Parameterless" << endl;
}

Person::Person(string name)
{
    cout << "Person Parameterized" << endl;
}
void Person::accept()
{
    cout << "Person acccept" << endl;
}
void Person::display()
{
    cout << "Person display" << endl;
}
