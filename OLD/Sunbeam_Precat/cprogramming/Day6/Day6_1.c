#include<stdio.h> 

int main()
{
    int a = 100; 
    int b = 200; 
    int c = 300;
    int max;  

    // if(a > b )
    // {
    //     if( a > c )
    //         max = a; 
    //     else 
    //         max = c;   
    // }
    // else 
    // {
    //     if( b > c )
    //         max = b; 
    //     else 
    //         max = c;   
    // }

   max = a > b ? ( a > c ? a : c  ) : ( b > c ? b : c );     
    //    cond ?        exp1        :    exp2  
    printf("max=%d",max); 

    // a > b ? printf("%d",a) : printf("%d",b);

}

// int main() 
// {
//     int max; 

//     int a = 110;
//     int b = 120; 

//     // if(a>b)
//     //   max = a; 
//     // else 
//     //   max = b;

//     // printf("%d",max);    

//     max = a > b ?  a    :    b; 
//     //   condt  ? exp1   :   exp2   

//     printf("max = %d",max); 

//     return 0; 

// }