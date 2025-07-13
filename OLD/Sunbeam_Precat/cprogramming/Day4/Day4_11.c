#include<stdio.h> 

int main()
{
    // int result;
    // int num1 = 1; 
    // int num2 = 2; 
    // result = ++num1 || num2++;
    // //          2   ||  2++
    // //          T   ||  XXX
    // //              T
    // //   

    // printf("result = %d num1=%d num2=%d",result,num1,num2);  
    // //                1       2       2   

    // int result;
    // int num1 = 0; 
    // int num2 = 2; 
    // result = num1++ || num2++;
    // //        (0)++ ||  (2)++
    // //         F     ||  T
    // //            T        

    // printf("result = %d num1=%d num2=%d",result,num1,num2);  
                  
    // int result;
    // int num1 = 0; 
    // int num2 = 2; 
    // result = ++num1 && num2++;
   
    // printf("result = %d num1=%d num2=%d",result,num1,num2);  
                  
 
    // int result;
    // int num1 = 0; 
    // int num2 = 2; 
    // result = num1++ && num2++;
    // //        0(F)++  &&  XXXX 
    // //          0     
   
    // printf("result = %d num1=%d num2=%d",result,num1,num2);  
                  
    // int result;
    // int num1 = 1; 
    // int num2 = 2;
    // int num3 = 1;  
    // result = num1++ || num2++ && ++num3;
    // //       num1++ || (num2++ && ++num3 )
    // printf("result = %d num1=%d num2=%d num3=%d",result,num1,num2,num3);  
     
    // int result;
    // int num1 = 1; 
    // int num2 = 2;
    // int num3 = 11;  
    // result = num1++ && num2++ || ++num3;
    // //      (num1++ && num2++) || ++num3
    // //              T          ||  XXXX          
    // printf("result = %d num1=%d num2=%d num3=%d",result,num1,num2,num3);  
     
    //  int result;
    // int num1 = 0; 
    // int num2 = 2;
    // int num3 = 11;  
    // result = num1++ && num2++ && ++num3;
    // //       (num1++ && num2++) && ++num3
    // //           F        XXX   &&
    // //                  F       &&  XXXX
    // //              F 
    
    // printf("result = %d num1=%d num2=%d num3=%d",result,num1,num2,num3);  

       int result;
    int num1 = 0; 
    int num2 = 2;
    int num3 = 11;  
    result = num1++ || num2++ || ++num3;
    //        0++   ||   2++  || xxxx
    //        1     ||   3    || XXXX
    //              T       
    //              TRUE       
    
    printf("result = %d num1=%d num2=%d num3=%d",result,num1,num2,num3);  
         

}