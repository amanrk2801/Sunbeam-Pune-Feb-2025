#include<stdio.h> 

// main --> user defined function 
int main(int argc, char const *argv[])
{
    int i;

    for(i=0;i<argc;i++)
    {
        puts(argv[i]);  
    }
    printf("\n %d\n",argc);

    printf("%d\n",argv[argc]);  

    return 0;
}

