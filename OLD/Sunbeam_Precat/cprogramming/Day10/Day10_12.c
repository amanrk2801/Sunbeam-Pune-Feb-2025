#include<stdio.h> 

int main() 
{
    const int num  = 10; 
    const int * const ptr = &num;
    const int num2 = 100;

   // const int const * const ptr = &num // OK      

 //ptr is a constant pointer pointing to the constant integer variable     

        printf("num=%d",num);
        printf("num=%d",*ptr);

        //*ptr = 500;  // ERROR

       // ptr = &num2;  // ERROR 
}

// int main() 
// {
//         int num = 100; 
//         int num1 = 500; 
//         int * const ptr = &num;
//      /*
//             int * const ptr;
//             ptr = &num // not possible // ERROR 
//      */
//     // int * ptr const // ERROR    
// //ptr is a constant pointer pointing to non constant int variable           

//         printf("num=%d",num);
//         printf("num=%d",*ptr);

//         *ptr = 1000; 

        
//         printf("num=%d",num);
//         printf("num=%d",*ptr);

//         //ptr = &num1;  Not possible 
// }

// int main() 
// {
//     const int num = 10; // num is not a constant variable 
//     const int num1 = 20;  
//     const int *ptr = &num;
//     //int const *ptr = &num; // OK 
//     //const int const *ptr = &num// OK    
//     //ptr is a non constant pointer pointing to the constant integer variable      

//     printf("%d\n",num); // 10
//     printf("%d\n",*ptr); // 10

//    // *ptr = 500; // ERROR   

//     ptr = &num1; 
//     printf("%d\n",num1); // 10
//     printf("%d\n",*ptr); // 10
    

//  }
// int main() 
// {
//     int num = 10; // num is not a constant variable 
//     int *ptr = &num;
// // ptr is non constant pointer pointing to non constant intger variable     


//     printf("%d",num); // 10 
//     printf("%d",*ptr);// 10  
 
//  }

// int main() 
// {
//     const int num = 10; 

//     // const --> type qualifier 

//     num = 100; 
//     printf("%d",num); 
// }