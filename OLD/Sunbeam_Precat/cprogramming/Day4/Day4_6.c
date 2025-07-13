#include<stdio.h> 

int main() 
{
        int a =1;
        int b =2;
        int c =3; 

         a+=b+=c+=1;
         // 3 operators of +=  

        //c = c + 1 // c = 3 + 1 --> 4 
        //b = b + c // b = 2 + 4 --> 6 
        //a = a + b // a = 1 + 6 --> 7 

        printf("%d %d %d",a,b,c); 
        //               7  6 4 




}
// int main() 
// {
//     //Short-hand operators
//     //num+=2;

//     int num = 2; 
//     //num+=2; // num = num + 2
//     //num-=2; // num = num - 2 
//     //num/=2; // num = num / 2
//     num%=2; // num = num % 2   
//     printf("%d",num);  
  

// }

