#include<stdio.h> 

int main() 
{
    int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   

 // Name of array represents the base address
     int *ptr; 
     ptr = arr; //ptr is storing the base address of array 
     // i.e 100
     // ptr = &arr[0];    

    //printf("%u\n",arr); 
    // printf("%u\n",ptr); 
    // printf("%u\n",ptr+1);
    // printf("%u\n",ptr+2);
    // printf("%u\n",ptr+3);
    // printf("%u\n",ptr+4);    
    
   // printf("%d\n",*ptr);// 10 
    // *ptr 
    //valueat(ptr)
    //valueat(100)   
   // printf("%d\n",*(ptr+1));
    //*(ptr+1) 
    //*(100 + 1 )
    //*(104)
    // 20   

    //printf("%d\n",*(ptr+2));
    //printf("%d\n",*(ptr+3));
    //printf("%d\n",*(ptr+4));

    //arr[1] --> array notation  // value 
    // *(arr+1) --> pointer notation  // value

    // ptr[1]  // array notation 
    // *(ptr+1)// pointer notation 

     //printf("%d\n",ptr[0]);
     //printf("%d\n",0[ptr]);
     // ptr[0]
     //*(ptr+0) 
     //*(100) 
     // 10     

     //printf("%d\n",ptr[1]);
     //ptr[1] 
     //*(ptr + 1 )
     //*(100 + 1 )
     //*(104)
     // 20          

        printf("%d",ptr[-1]);
        //ptr[-1]
        //*(ptr + -1)
        //*(ptr - 1 )
        //*(100 - 1 )
        //*(96)
        // garbage     



}