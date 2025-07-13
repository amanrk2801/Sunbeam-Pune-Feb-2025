#include<stdio.h> 
struct emp
{
    int empno; 
    char name[20]; 
    double sal; 
};
int main() 
{
    // int arr[3]; // int array 

       struct emp arr[3]={
            {1,"Ketan",1000},
            {2,"Amit",2000},
            {3,"Rahul",3000},
      };

    int i; 
    for(i=0;i<3;i++)
    {
        printf("%d %s %lf \n",arr[i].empno,arr[i].name,arr[i].sal); 
    }





}