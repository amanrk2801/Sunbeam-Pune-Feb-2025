#include<stdio.h> 

int main() 
{
    // using init list 
    char str1[5] = {'A','B','C','D','E'}; 
    // 5 char array = 5 bytes 

    char str2[5] = {'a','b','c','d','\0'}; 
    // 5 char array terminated with \0 char = string

    char str3[5] ={ 'I','n','f','o'};// partially initialized
    // rest elements are init to zero 
    // 5 char array terminated with '\0' --> string   

    char str4[] = {'S','u','n','b','e','a','m'}; // 7 char array = 7 bytes 
    
    char str5[5] = {'a','b','\0','d','\0'}; 
    int i; 

          for(i=0;str5[i]!='\0';i++)
    // print all the chars from index 0 until '\0'  is found
        putchar(str5[i]); 


    //      for(i=0;i<7;i++)
    //    putchar(str4[i]); 

    // for(i=0;i<5;i++)
    //     putchar(str1[i]); 

    // for(i=0;str2[i]!='\0';i++)
    // // print all the chars from index 0 until '\0'  is found
    //     putchar(str2[i]); 

    //   for(i=0;str3[i]!='\0';i++)
    // // print all the chars from index 0 until '\0'  is found
    //     putchar(str3[i]); 

    return 0; 
}
/*
    char str1[50] = {'A'}; 
        [0]     [1]    [2]
        100     104    108
*/