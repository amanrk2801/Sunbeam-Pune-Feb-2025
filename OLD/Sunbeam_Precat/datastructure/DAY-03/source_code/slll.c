//implementation of singly linear linked list operations:
#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
	int data;//4 bytes
	struct node *next;//self referential pointer – 4 bytes
}node_t;

void add_node_at_last_position(int data);
void add_node_at_first_position(int data);
node_t *create_node(int data);
void display_list(void);
int count_nodes(void);

//create an empty linked list
node_t *head = NULL;


int menu(void)
{
    int choice;

    printf("***** singly linear linked list operations *****\n");
    printf("0. exit\n");
    printf("1. add node into the list at last position\n");
    printf("2. add node into the list at first position\n");
    printf("3. add node into the list at specific position\n");
    printf("4. delete node from the list which is at first position\n");
    printf("5. delete node from the list which is at last position\n");
    printf("6. delete node from the list which is at specific position\n");
    printf("7. display list\n");
    printf("enter the choice: ");
    scanf("%d", &choice);

    return choice;
}

enum menu_options{ EXIT, ADDLAST, ADDFIRST, ADDATPOS, DELFIRST, DELLAST, DELATPOS, DISP };


int main(void)
{
    int pos;
    int data;
    //printf("sizeof(struct node): %d bytes\n", sizeof(struct node));
    //printf("sizeof(node_t): %d bytes\n", sizeof(node_t));

    while( 1 )
    {
        int choice = menu();

        switch( choice )
        {
            case EXIT:
                if( head != NULL )
                    free_list();

                exit(0);

            case ADDLAST:
                printf("enter the data: ");
                scanf("%d", &data);
                add_node_at_last_position(data);
                break;

            case ADDFIRST:
                printf("enter the data: ");
                scanf("%d", &data);
                add_node_at_first_position(data);
                break;

            case ADDATPOS:
                break;

            case DELFIRST:
                break;

            case DELLAST:
                break;

            case DELATPOS:
                break;

            case DISP:
                display_list();
                break;
        }
    }

    return 0;
}

void display_list(void)
{
    //if list is not empty
    if( head != NULL ){
        //start traversal from first node
        node_t *trav = head;
        printf("no. of nodes in a list are: %d\n", count_nodes());
        printf("list is: head -> ");
        //traverse the list till last node including it
        while( trav != NULL )
        {
            printf("%d -> ", trav->data);//visit data part of each node
            trav = trav->next;
        }
        printf("null\n");
    }
    else
        printf("list is empty !!!\n");
}


node_t *create_node(int data)
{
    //1. allocate memory dynamically for node
    node_t *temp = (node_t *)malloc(sizeof(node_t));
    /* malloc() functions allocates requested bytes of memory from heap section and on success
    it returns starting addr of dynamically allocated block and on failure it returns
    NULL */
    if( temp == NULL )
    {
        printf("malloc() failed !!! insufficient heap memory !!!\n");
        exit(1);
    }

    //2. initialize members of the node
    temp->data = data;
    temp->next = NULL;
    //3. return starting of dynamically allocated node to the calling function
    return temp;
}

void add_node_at_last_position(int data)
{
    //step-1: create a newnode
    node_t *newnode = create_node(data);

    //step-2: if list is empty --> attach newly created node to the head
    if( head == NULL )
    {
        //store an addr of newly created node into the head
        head = newnode;    
    }
    else//step-3: if list is not empty
    {
        //start traversal from first node
        node_t *trav = head;
        //traverse list till last node
        while( trav->next != NULL ){
            trav = trav->next;//move trav pointer towards its next node
        }

        //attach newly created node to the last node
        //i.e. store an addr of newly created node into the next part last node
        trav->next = newnode;

    }
}

void add_node_at_first_position(int data)
{
    //step-1: create a newnode
    node_t *newnode = create_node(data);

    //step-2: if list is empty --> attach newly created node to the head
    if( head == NULL )
    {
        //store an addr of newly created node into the head
        head = newnode;    
    }
    else//step-3: if list is not empty
    {
        //store an addr of cur first node into the next part of newly created node
        newnode->next = head;
        //attach newly created node to the head
        head = newnode;
    }
}

int count_nodes(void)
{
    int cnt = 0;
    //if list is not empty
    if( head != NULL )
    {
        //start traversal from first node
        node_t *trav = head;
        //traverse the list till last node (including it)
        while( trav != NULL ){
            cnt++;//increment the counter by 1
            trav = trav->next;//to move trav towards its next node
        }
    }

    return cnt;
}


