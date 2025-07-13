#include<stdio.h> 
#include<string.h> 
int main() 
 {
    // char name1[50] ="Ketan";  // Literal 
    
    // int i = 0; 

    // name1[i] = 'W'; // Allowed
    // puts(name1); 
 
    
    char *name1 = "ABCD"; 

    int i = 0;  

    name1[i] = 'W';// abnormally terminate
    // runtime error 

    puts(name1); 
    
    
 
    return 0;
}
// int main() 
// {
//     char name1[50] ="Ketan"; 
//     char name2[50] ="Ketan";

//     if(name1==name2) // comparing the address 
//        printf("same");
//     else 
//        printf("Different");  

//     return 0;
// }