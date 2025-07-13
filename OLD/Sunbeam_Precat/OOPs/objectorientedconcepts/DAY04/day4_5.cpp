#include<iostream>
using namespace std;

int main(void)
{
    int n;
    int i;
    cout<<"Enter number of elements you wish to insert in an array :";
    cin>>n;

    //1.REQUEST MEMORY DYNAMICALLY
    int *ptrArr = new int[n]; //allocate memory in the heap section 

    //2. USE THE MEMORY
    cout<<"Enter Array Elements :";
    for(i=0;i<n;i++)
    {
        cin>>ptrArr[i];
    }
    cout<<"\n Array Elements are:";
    for(i=0;i<n;i++)
    {
        cout<<"\t"<<ptrArr[i];
    }
    
    //3. RELEASE THE MEMORY
    delete []ptrArr; // MAY LEAD TO DANGLING POINTER , MEMORY LEAKAGE
    ptrArr=NULL; // TO AVOID MEMORY LEAKAGE 
    return 0;
}