#include<stdio.h> 

int main() 
{
    char *numbers[] = {"zero","One","Two","Three"}; 

    printf("%d\n",sizeof(numbers));     

    int num; 
    printf("Enter the number\n"); 
    scanf("%d",&num); // 1 
    printf("%s\n",numbers[num]); 
        // numbers[1]; 

    return 0; 
}

// numbers[0] --> base address where one is stored 