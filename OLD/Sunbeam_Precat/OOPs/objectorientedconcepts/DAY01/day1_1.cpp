#include<iostream>

int main(void)
{
    wchar_t w=L'A'; // wide character // L : Literal 
    printf("%d ",w);
    printf("\n size : %d %d",sizeof(w),sizeof(wchar_t));
    return 0;
}



/*
int main(void)
{
    bool b1=true;
    bool b2=false;
    printf("B1 : %d B2 : %d",b1,b2);
    printf("\n size : %d %d",sizeof(b1),sizeof(bool));
    return 0;
}

*/