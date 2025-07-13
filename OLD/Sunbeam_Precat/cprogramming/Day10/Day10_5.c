#include<stdio.h> 

int main() 
{
     int arr[5] = { 10 ,20 ,30,40,50}; 

    //  [0]   [1]     [2]    [3]    [4]
    //   10    20      30    40      50   
    //  100    104    108    112    116   

 // Name of array represents the base address  

        // value 
        printf("%d\n",*arr);// 10 
        // arr --> base address --> 100 
        // *arr --> valueat(arr)
        // valueat(100) --> 10 

        printf("%d\n",*(arr+1)); // 20
        //*(arr+1)
        //*(100 + 1 )
        //*(104) 
        //20 

        printf("%d\n",*(arr+2)); //30 
        //*(arr+2)
        //*(100 + 2 )
        //*(108)
        // 30    

        printf("%d\n",*(arr+3));// 40  
        //*(arr+3)
        //*(100 + 3 )
        //*(112)
        // 40    
                

        printf("%d\n",*(arr+4));// 50 
        //*(arr + 4 )
        //*(100 + 4 ) 
        //*(116)
        // 50   

        printf("%d\n",*(arr+1)); // 20 
        printf("%d\n",*(1+arr)); // 20
         printf("%d",*(arr+1+1-1)); // 20 
         // arr + 2 - 1 
         // arr + 1    
      


    return 0; 
}