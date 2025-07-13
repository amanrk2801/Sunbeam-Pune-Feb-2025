#include<stdio.h> 
#define PRINT(x) puts(#x);
#define PRINT_VAR(var) printf(#var "=%d\n",var)

// token pasting operator 

#define PRINT_SAL(a,b) printf("sal=%d\n",a##b)

int main() 
{

    int basicsalary=5000; 
    int adventure = 100; 
    PRINT(Sunbeam infotech)
    // puts("Sunbeam infotech");

    PRINT_VAR(adventure);
    //printf("adventure" "=%d\n",adventure)
   

    PRINT_SAL(basic,salary);
    //          a    b 
    //         a##b
    //         basic  salary 
    //         basic##salary
    //         basicsalary    
    //printf("sal=%d\n",basicsalary); 
    return 0; 
}