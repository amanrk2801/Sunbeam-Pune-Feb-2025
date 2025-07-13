
#include<stdio.h> 
struct date
{
    int day,month,year; 
};
struct emp
{
    int empno;  // 4 
    char name[20]; // 20 
    double sal; // 8 
    struct date join; // 12  
};

int main() 
{
    struct emp e1={1,"Ketan",1000.0,{1,1,2000}};
    struct emp e2; 
    struct emp *p;  

  printf("%d %s %lf,%d-%d-%d\n",e1.empno,e1.name,e1.sal,e1.join.day,e1.join.month,e1.join.year);  

  printf("Enter empno name sal  joining(day,month,year)\n");
  scanf("%d%s%lf%d%d%d",&e2.empno,e2.name,&e2.sal,&e2.join.day,&e2.join.month,&e2.join.year);    

  p = &e2;   

  printf("%d %s %lf,%d-%d-%d\n",p->empno,p->name,p->sal,p->join.day,p->join.month,p->join.year);   


    return 0; 
}

