#include<stdio.h> 
#define SWAP(a,b,type) { type t = a; a = b; b = t; }

int main() 
{
    int p,q; 
    p=10;
    q=12; 
    SWAP(p,q,int); 
    printf("p=%d q=%d",p,q);  
}