#include<stdio.h> 
int add(int a , int b ); 
void sub ( void ); 
void mult(int p , int q ); 
double divv ( int num3 , int num4); 
int main() 
{   
    int num1,num2,res; 
    printf("Enter the num1 and num2\n"); 
    scanf("%d%d",&num1,&num2); // 2 1
    // I/p --> num1 = 2 num2 = 1  

    //3 
    res = add(num1,num2); // 2 1 
    // num1 and num2 are the actual arguments  
    // function call  

    printf("res = %d\n",res); //3 

    sub();

    mult(2,3);  // function calling 
    
    double res1;
    int num3,num4; 
    printf("Enter the num3 and num4\n"); 
    scanf("%d%d",&num3,&num4); 

    res1 = divv(num3,num4);  // function call

    printf("Division = %lf\n",res1); 

    return 0; 
}


// function defination 
double divv ( int num3 , int num4)
{
    double result; 
    result = (double)num3/num4; 
    return result; 
}



// p = 2   q = 3 
void mult(int p , int q )
{
    int res; 
    res = p * q;  // 2 * 3 
    printf("Mult:res = %d\n",res); // 6 
     
}


// function defination 
void sub ( void )
{
    int num1,num2;
    int res;
    printf("Sub : Enter the two numbers\n");
    scanf("%d%d",&num1,&num2); // 2  1  
    res = num1 - num2; // 1 
    printf("Sub : result = %d\n",res); 

}


int add(int a , int b ) // it will take the i/p and give the addition of two numbhers 
//return-type function-name ( formal arguments )
{
      int result; 
      result = a + b;   // 2 + 1 
      return result;    // 3 
} 



/*
    main() 
    {
        int res;    
        res = fun();  
    }

    int fun( void ) 
    {
        return 2;
        return 3;
        // return ( 2 ,3 );    
    }

*/