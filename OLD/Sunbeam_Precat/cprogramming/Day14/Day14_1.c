#include<stdio.h> 

// declaration of the structure 
struct emp
{
    int empno; 
    char name[20]; 
    double sal; 
};
void accept_emp(struct emp *p);  
void display_emp(struct emp e); 
int main() 
{
    struct emp e1; 
    // e1 --> object / variable  

    accept_emp(&e1); // pass by address;  
    display_emp(e1); // pass by value;

    //e1.sal = 0;  

    display_emp(e1);
    

}

void display_emp(struct emp e)
{
    printf("%d %s %lf\n",e.empno,e.name,e.sal); 
}

void accept_emp(struct emp *p)
{   
        printf("Enter the empno:");
        scanf("%d",&p->empno);

        
        printf("Enter the empname:");
        scanf("%s",p->name);

        
        printf("Enter the Sal:");
        scanf("%lf",&p->sal); 
}













