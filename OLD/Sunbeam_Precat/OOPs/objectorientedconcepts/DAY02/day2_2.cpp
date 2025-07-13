#include<iostream>
using namespace std;

/*
//NOT ALLOWED 
int main()
{
   
}

void test()
{
     namespace na
    {
        
    }
}
*/

/*
//NOT ALLOWED 
// main() can not be written inside namespace 
namespace na
{
    int main()
    {

    }
} 
*/

/*
//NOT ALLOWED 
namespace na
{
    int num1=25;
}
namespace na
{
    int num1=35;
}

na::num1 ???? Confusion

*/




/*
//ALLOWED 
namespace na
{
    int num1=25;
}
namespace na
{
    int num2=35;
}

// na::num1 ===> 25
// na:: num2 ===> 35 
*/


/*
//namespace withing another namespace (nested namespace)
namespace na
{
    int num1=10;
    int num2=20;
    namespace nb
    {
        int num1=50;
        int num3=30;
    }
}
int main(void)
{
    cout<<"Num1 : "<<na::num1;
    cout<<"\n Num2 : "<<na::num2;
    cout<<"\n Num1 from nb : "<<na::nb::num1;
    cout<<"\n Num3 : "<<na::nb::num3;
}


*/


// namespace_name::variablename;



/*
namespace na
{
    int num1=50;
    int num2=45;
}
namespace nb
{
    int num1=40;
    int num3=60;
}
int main(void)
{
    //cout<<num1; //error: 'num1' was not declared in this scope
    cout<<"Accessing num1 from na : "<<na::num1;
    cout<<"\n Accessing num1 from nb : "<<nb::num1;
    cout<<"\n Access num2 from na : "<<na::num2;
    return 0;
}

// Scope resoultion is used to access namespace variables 

*/