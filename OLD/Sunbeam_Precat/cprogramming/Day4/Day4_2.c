#include<stdio.h> 

int main()
{
    // int num1 = 2;
    // int num2 = 2;
    // int num3 = 2; 
    // float result; 

    // result = (num1 + num2 + num3) / 3; 
    // //         (int + int + int) / int 
    // //              int  / int 
    // //                int 

    // printf("%f",result); 

    // int num1 = 2;
    // int num2 = 2;
    // int num3 = 1; 
    // float result; 

    // result = (num1 + num2 + num3) / 3; 
    //       //   (int +  int + int) / (int)
    //       //  1.66 --> 1.000     int      
    
    // printf("%f",result); 

    // int num1 = 2;
    // int num2 = 2;
    // int num3 = 1; 
    // float result; 

    // // double 
    // // float
    // // int 
    // // char

    // result = (num1 + num2 + num3) / 3.0;
    // //       (int + int + int) /  (double)--> mixed arithmatic  
    // //              int / double
    // //              double        
    // printf("%f",result);   

    //   int num1 = 2;
    // int num2 = 2;
    // int num3 = 1; 
    // float result; 

    // // double 
    // // float
    // // int 
    // // char

    // result = (num1 + num2 + num3) / 3.0f;
    // //       (int + int + int) /  (float)--> mixed arithmatic  
    // //              int / float
    // //              float        
    // printf("%f",result);   
  
    int num1 = 2;
    int num2 = 2;
    int num3 = 1; 
    float result; 

    // double 
    // float
    // int 
    // char

    // mixed arithmatic --> int and float 
    result = ((float)num1 + num2 + num3) / 3;
    //       (float + int + int) /  (int)--> mixed arithmatic  
    //              float / int
    //              float        
    printf("%.2f",result);   
  



    return 0; 
}