#include<stdio.h> 

int main() 
{
    enum color
    {
           RED=1,BLUE,GREEN,VIOLET  
    }; 

    // function pointer   

    //enum color c1;  

    //typedef int INT; 
    // creating alias

    typedef enum color e_1;
    e_1 c1,c2,c3;
    // enum color c1,c2,c3 
    c1 = RED;
    printf("%d",c1);     

 
}