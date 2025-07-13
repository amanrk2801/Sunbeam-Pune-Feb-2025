#include<stdio.h> 

int main() 
{
  //logical operators result in 0 or 1.
  //  &&  || ! --> logical and , Logical or , logical not  

  //Any non zero value is considered as TRUE 

  /*
                Logical Or

         P         Q       P || Q      
         T         F         T
         F         T         T
         T         T         T
         F         F         F 

                      Logical AND

         P         Q       P && Q      
         T         F         F
         F         T         F
         T         T         T
         F         F         F   

            Logical ! 
            T --> !T --> F --> 0
            F --> !F --> T --> 1            



  */  
    // int result; 
    // int num1 = 10; 
    // int num2 = 30; 

    // result = num1 || num2;
    // //        T   ||  XXX 
    // printf("result=%d",result);      

    // int result; 
    // int num1 = 0; 
    // int num2 = 30; 

    // result = num1 || num2;
    // //        F   ||  T
    // //            T 
    // printf("result=%d",result);// 1       

    // int result; 
    // int num1 = 0; 
    // int num2 = 0; 

    // result = num1 || num2;
    // //        F   ||  F
    // //            F 
    // printf("result=%d",result);// 0       


    // int result; 
    // int num1 = -1; 
    // int num2 = 30; 

    // result = num1 && num2;
    // //        T  &&  T
    // //            T 
    // printf("result=%d",result);// 1       

    // int result; 
    // int num1 = 0; 
    // int num2 = 30; 

    // result = num1 && num2;
    // //        F  &&  XXXX
    // //            F 
    // printf("result=%d",result);//0      

        // int num = 10;// TRUE  
        // printf("%d",!!num); 



    return 0; 
}