#include<stdio.h> 
#include<string.h> 

int main() 
{
    
    char str1[] = "Sunbeam infotech"; // 16 + '\0' 
    char *str2= "Sunbeam Infotech";// str2 is a pointer to string constant
    char str3[] = "Sunbeam\0Infotech";// 16 + '\0' 
    
     printf("sizeof(str1)=%d\n",sizeof(str1)); //17 
     printf("sizeof(str2)=%d\n",sizeof(str2)); //4 
     printf("sizeof(str3)=%d\n",sizeof(str3)); //17 

        


     printf("\n"); 

     // strlen --> strlen will give me the length

     printf("strlen(str1)=%d\n",strlen(str1)); //16    
     printf("strlen(str2)=%d\n",strlen(str2)); //16
     printf("strlen(str3)=%d\n",strlen(str3)); //16     


   
    return 0; 
}