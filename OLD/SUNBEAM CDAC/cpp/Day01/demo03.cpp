#include <iostream>

int main()
{
    wchar_t wch = L'A';

    printf("Int Value inside wch - %d\n", wch);
    printf("Char Value inside wch - %c\n", wch);
    printf("Size of wch - %ld\n", sizeof(wch));
    return 0;
}