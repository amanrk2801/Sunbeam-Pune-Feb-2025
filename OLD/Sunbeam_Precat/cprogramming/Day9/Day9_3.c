#include<stdio.h> 

// pass by value 
void sumpro(int a, int b, int ps, int pp) 
{
 ps = a + b;
 pp = a * b;

 // print the ps and pp over here 
}
int main()
{
 int x = 12, y = 4, s, p;
 sumpro(x, y, s, p);
 printf("%d %d", s, p);
 return 0;
}

// pass by address / pass by reference