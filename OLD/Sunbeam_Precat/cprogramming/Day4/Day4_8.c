#include<stdio.h> 

int main() 
{
    //int num = 1,2,3;  // ERROR

      int num; // variable declaration 

    //   num = 1; 
    //   printf("%d",num); // 1 

        
    //   num = 1,2,3; 
    //   // = --> Assignment operator 
    //   printf("%d",num); // 1   

    //    num =(1,2,3); 
    //   // = --> Assignment operator 
    //   printf("%d",num); // 3 

     num =((1,2),3); 
     //    (2 , 3)
     //      3   
     // = --> Assignment operator 
      printf("%d",num); // 3 

}