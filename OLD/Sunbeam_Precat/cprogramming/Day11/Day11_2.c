#include<stdio.h> 

int main() 
{
    // literal 

    char str4[5] = "Tech";
// Tech is strin literal/const --> short hand declare 
// 'T' ,  'e' , 'c' ,  'h' ,  '\0'
// string constant always have \0 at the end;

    char str5[] = "Ketan";
    // 'K' 'e' 't' 'a' 'n' '\0' 

    char str6[4] = "Pune"; // str6 is not a string // char array 
    int i;

    char str7[] =""; // litral  

     printf("%d",sizeof(str7));    

    // for(i=0;str5[i]!='\0';i++)
    //        putchar(str5[i]);  

    return 0; 
}

/*
        Akshay

        pune
        char str[2]="Pune" // yes   
        
    
*/