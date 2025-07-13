#include<stdio.h> 

int main()
{

 int arr[3][3]={1,2,3,4,5,6,7,8,9}; 
  // C follows row major order    
/*
            [0]    [1]    [2]
    [0]      1      2      3 
           100     104    108

    [1]      4      5      6 
            112     116     120 

    [2]      7      8      9 
            124     128    132      

*/   
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%u  ",&arr[i][j]); 
            }
            printf("\n");
        }
        printf("\n");

        //printf("%u\n",arr); 
        // arr --> name of the array 
        // name of array --> base address 

       // printf("%u\n",*arr);// base address 

        //printf("%u\n",**arr);
        // *(*arr)--> base address 
        // *(100)
        // 1 

        // printf("%u\n",*arr);

        // printf("%u\n",*(arr+1));

        // printf("%u\n",*(arr+2)); 

        
        // printf("%u\n",**arr); // 1 

        // printf("%u\n",*(*(arr+1)));// 4 

        // printf("%u\n",*(*(arr+2))); // 7 

        // arr[0][0]
        // *(*(arr+0)+0)

            // pointer notation 
        //printf("%u\n",**arr); // 1 

        //printf("%u\n",*(*(arr+1)+1));// 4 

        //printf("%u\n",*(*(arr+2)+1)); // 7 

        //printf("%d",*(*(arr+2)+2));// 9 


        //printf("%d",arr[0][0]);// 1 
        // array notation 

        //printf("%d",*(*(arr+0)+0));// 1  
        // pointer notation   


       // printf("%d",arr[1][1]); // 5 
        // array notation 

        //printf("%d",*(*(arr+1)+1));// 5 

        // arr[1][2]; // array notation 
        // *(*(arr+1)+2) // pointer notation 

        // arr[2][1]; 
        //  *(*(arr+2)+1) 

        //printf("%d",arr[2][2]); // 9 

        //printf("%d",*(*(2+arr)+2));// 9  


        return 0; 
}
