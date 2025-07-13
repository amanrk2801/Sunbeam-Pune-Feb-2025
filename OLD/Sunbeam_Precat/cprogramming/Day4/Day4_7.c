#include<stdio.h> 

int main() 
{
    //Pre-increment

    // int num = 5;
    // int result; 
    // result = ++num;   // num = num + 1 --> num = 5 + 1 --> 6 
    // // first increment the value and then copy the state in the result
    // printf("%d %d",num,result);
    // //              6    6  

    int num = 5;
    int result; 
    result = num++;  // num = num + 1   

     //num++ ,num+=1 ,num=num + 1     

    printf("num=%d result=%d",num,result);
    //           6         5                 
     

    return 0;

}