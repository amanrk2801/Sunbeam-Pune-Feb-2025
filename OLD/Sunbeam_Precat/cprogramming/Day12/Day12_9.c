#include<stdio.h> 
#include<stdlib.h> 

// int main() 
// {


//     int *ptr,i; 

//     ptr = (int*)calloc(3,sizeof(int));  

//     for(i=0;i<=2;i++)
//     {
//         *(ptr+i) = 10 * (i+1); 
//         //ptr[i] 
//     } 
//     for(i=0;i<=2;i++)
//     {
//         printf("%d ",*(ptr+i)); 
//     }

//     free(ptr);  // to avoid memory leakage

//     ptr = NULL; // to avoid dangling pointer



//     return 0; 
// }



// int main() 
// {


//     float *ptr;  

//     ptr = (float*)malloc(sizeof(float));
//     // requesting the memory  

//     *ptr = 12.5;      // using the memory 

//     printf("%f",*ptr); // print 

//     free(ptr);  // To avoid memory leakage 

//     ptr = NULL; // To avoid dangling pointer

//     return 0; 
// }


/*
    ptr = (int*)calloc(3,sizeof(int));  

    for(i=0;i<=2;i++)
//     {
//         *(ptr+i) = 10 * (i+1); 
//         //ptr[i] 
//     } 
//     for(i=0;i<=2;i++)
//     {
//         printf("%d ",*(ptr+i)); 
//     }

    ptr = (int*)realloc(ptr,5*sizeof(int));  

    ptr[3] = 100;  
    ptr[4] = 200; 
    
*/