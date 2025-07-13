#include<stdio.h> 

int main() 
{
    // enum is a user defined dataype 

    /*
        int , float ,char ,double 

        int    num; 
       datatype variable-name
    */

    // creating the datatype
    // user-defined datatype  
    enum color
    {
           RED,BLUE=1,GREEN,VIOLET  
    }; 

    enum color c1; 
    
    printf("Enter the color \n");
    scanf("%d",&c1); //3 

    switch (c1) //3
    {
    case RED: // case 1:  
        printf("Red color\n"); 
        break;
    
    case BLUE: // case 2: 
        printf("Blue color\n"); 
        break;
        
    case GREEN: // case 3:  
        printf("Green color\n"); 
        break;
        
    case VIOLET: // case 4: 
        printf("Violet color\n"); 
        break;
    default:
        printf("Invalid case "); 
        break;
    }



    return 0; 

}

// int main() 
// {
//     // enum is a user defined dataype 

//     /*
//         int , float ,char ,double 

//         int    num; 
//        datatype variable-name
//     */

//     // creating the datatype
//     // user-defined datatype  
//     // enum color
//     // {
//     //        RED,BLUE,GREEN=1,VIOLET  
//     // }c1,c2,c3,c4; 

//     enum  // Annonymous enum 
//     {
//            RED,BLUE,GREEN=1,VIOLET  
//     }c1,c2,c3,c4; 

//     //enum color c1,c2,c3,c4; 
//     // int   num1,num2,num3,num4 
//     printf("%d\n",sizeof(c1)); 
//     c1 = RED;
//     c2 = BLUE;
//     c3 = GREEN; 
//     c4 = VIOLET;     
//     printf("%d %d %d %d",c1,c2,c3,c4) ;  
//     return 0; 

// }

// int main() 
// {
//     // enum is a user defined dataype 

//     /*
//         int , float ,char ,double 

//         int    num; 
//        datatype variable-name
//     */

//     // creating the datatype
//     // user-defined datatype  
//     enum color
//     {
//            RED,BLUE,GREEN=1,VIOLET  
//     }; 

//     enum color c1,c2,c3,c4; 
//     // int   num1,num2,num3,num4 
//     printf("%d\n",sizeof(c1)); 
//     c1 = RED;
//     c2 = BLUE;
//     c3 = GREEN; 
//     c4 = VIOLET;     
//     printf("%d %d %d %d",c1,c2,c3,c4) ;  
//     return 0; 

// }
// int main() 
// {
//     // enum is a user defined dataype 

//     /*
//         int , float ,char ,double 

//         int    num; 
//        datatype variable-name
//     */

//     // creating the datatype
//     // user-defined datatype  
//     enum color
//     {
//            RED=1,BLUE,GREEN=2,VIOLET  
//     }; 

//     enum color c1,c2,c3,c4; 
//     // int   num1,num2,num3,num4 
//     printf("%d\n",sizeof(c1)); 
//     c1 = RED;
//     c2 = BLUE;
//     c3 = GREEN; 
//     c4 = VIOLET;     
//     printf("%d %d %d %d",c1,c2,c3,c4) ;  
//     return 0; 

// }
// int main() 
// {
//     // enum is a user defined dataype 

//     /*
//         int , float ,char ,double 

//         int    num; 
//        datatype variable-name
//     */

//     // creating the datatype
//     // user-defined datatype  
//     enum color
//     {
//            RED=1,BLUE,GREEN,VIOLET  
//     }; 

//     enum color c1,c2,c3,c4; 
//     // int   num1,num2,num3,num4 
//     printf("%d\n",sizeof(c1)); 
//     c1 = RED;
//     c2 = BLUE;
//     c3 = GREEN; 
//     c4 = VIOLET;     
//     printf("%d %d %d %d",c1,c2,c3,c4) ;  




   
//     return 0; 

// }
// int main() 
// {
//     // enum is a user defined dataype 

//     /*
//         int , float ,char ,double 

//         int    num; 
//        datatype variable-name
//     */

//     // creating the datatype
//     // user-defined datatype  
//     enum color
//     {
//            RED,BLUE,GREEN,VIOLET  
//     }; 

//     enum color c1,c2,c3,c4; 
//     // int   num1,num2,num3,num4 
//     printf("%d\n",sizeof(c1)); 
//     c1 = RED;
//     c2 = BLUE;
//     c3 = GREEN; 
//     c4 = VIOLET;     
//     printf("%d %d %d %d",c1,c2,c3,c4) ;  




   
//     return 0; 

// }