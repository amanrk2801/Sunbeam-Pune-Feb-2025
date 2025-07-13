#include<stdio.h> 
// global declaration  - accessible in whole file 
#include<string.h> 
struct emp // blueprint
{
    int empno;
    char ename[30]; 
    double sal;  
};  

int main() 
{
    struct student // accessible in current block /function  
    {
        int roll;
        char name[20];   
    }; 

    //e1 --> variable / object 
    struct emp e1 = { 11, "Ketan",10000.0 };  
    struct emp e2 = { 12, "Amit"};

    struct emp e3;  // only declaration 
    struct emp e4;  // only declaration

    /*
        int num = 100; 
        int *ptr = &num 
    */ 

     struct emp *p = &e1; // scale factor 
     // sizeof(struct emp) --> 42   

     printf("%d %s %.2lf\n",e1.empno,e1.ename,e1.sal);            

     printf("%d %s %.2lf\n",e2.empno,e2.ename,e2.sal);            

    // assign members 

      e3.empno=12;
      strcpy(e3.ename,"Akshay"); 
      e3.sal = 0;  

    printf("%d %s %.2lf\n",e3.empno,e3.ename,e3.sal);            

     printf("Enter empno name and sal"); 
     scanf("%d%s%lf",&e4.empno,e4.ename,&e4.sal);   
     printf("%d %s %.2lf\n",e4.empno,e4.ename,e4.sal);            

    // access the members through pointer 
    // -> // arrow operator / indirect access operator 

    printf("%d %s %lf",p->empno,p->ename,p->sal);

    return 0;  

}