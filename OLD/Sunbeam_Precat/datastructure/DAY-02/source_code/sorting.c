#include<stdio.h>

#define SIZE 10

#define SWAP(a, b) { int t=a; a=b; b=t; }


void display_array_elements(int arr[]);//arr - it is a pointer to 1-d array
void selection_sort(int arr[]);
void bubble_sort(int arr[]);
void insertion_sort(int arr[]);


int main(void)
{
    //int arr[SIZE] = {30,20,60,50,10,40};
    //int arr[SIZE] = {30,80,20,100,60,50,80,10,70,40};
    int arr[SIZE] = {10,20,30,30,50,60,70,80,90,100};

    printf("bfore sorting array ele's are: "); display_array_elements(arr);
    
    //selection_sort(arr);
    //bubble_sort(arr);
    insertion_sort(arr);

    printf("after sorting array ele's are: "); display_array_elements(arr);


    return 0;
}

void display_array_elements(int arr[])
{
    int index;
    
    for( index = 0 ; index < SIZE ; index++ )
        printf("%4d", arr[index]);

    printf("\n");

}

void selection_sort(int arr[])
{
    int sel_pos;
    int pos;
    int iterations=0;
    int comparisons=0;

    for( sel_pos = 0 ; sel_pos < SIZE-1 ; sel_pos++ ){//outer for loop is for iterations
        iterations++;
        for( pos = sel_pos + 1 ; pos < SIZE ; pos++ ){//inner for loop is for pos
            //if( ele at selected pos > ele at pos ) -> swap them
            comparisons++;
            if( arr[ sel_pos ] > arr[ pos ] )
                SWAP(arr[ sel_pos ], arr[pos] );
        }
    }

    printf("no. of iterations are : %d\n", iterations);
    printf("no. of comparisons are: %d\n", comparisons);
}

/*
//original bubble sort
void bubble_sort(int arr[])
{
    int pos;
    int iterations=0;
    int comparisons=0;
    int it;

    for( it = 0 ; it < SIZE-1 ; it++ ){//outer for loop is for iterations
        iterations++;
        for( pos = 0 ; pos < SIZE-it-1 ; pos++ ){//inner for loop is for pos
            //if(prev pos ele > its next pos ele) if in a pair : ele's are not in order --> swap them
            comparisons++;
            if( arr[ pos ] > arr[ pos+1 ] ){
                SWAP(arr[ pos ], arr[ pos+1 ] );
            }
        }
    }

    printf("no. of iterations are : %d\n", iterations);
    printf("no. of comparisons are: %d\n", comparisons);    
}
*/

//updated bubble sort (efficient)
void bubble_sort(int arr[])
{
    int pos;
    int iterations=0;
    int comparisons=0;
    int it;
    int flag = 1;

    for( it = 0 ; it < SIZE-1 && flag == 1 ; it++ ){//outer for loop is for iterations
        flag = 0;
        iterations++;//counter maintained to count no. of iterations
        for( pos = 0 ; pos < SIZE-it-1 ; pos++ ){//inner for loop is for pos
            //if(prev pos ele > its next pos ele) if in a pair : ele's are not in order --> swap them
            comparisons++;
            if( arr[ pos ] > arr[ pos+1 ] )
            {
                flag = 1;//aray ele's are not already sorted
                SWAP(arr[ pos ], arr[ pos+1 ] );
            }
        }
    }

    printf("no. of iterations are : %d\n", iterations);
    printf("no. of comparisons are: %d\n", comparisons);    
}

void insertion_sort(int arr[])
{
    int i;
    int iterations=0;
    int while_cnt=0;

    for( i = 1 ; i < SIZE ; i++ ){
        iterations++;
	    int key = arr[ i ];
	    int j = i-1;

        while( j >= 0 && key < arr[ j ] ){//if pos is valid then only compare value of key with ele at that pos
            while_cnt++;
            arr[ j+1 ] = arr[ j ];//shift ele towards right side by 1 pos
            j--;//goto the prev element
        }
	
	    //insert key at its appropriate position
	    arr[ j+1 ] = key;
    }

    printf("no. of ietarations are: %d\n", iterations);
    printf("no. of time control comes inside while loop: %d\n", while_cnt);

}














