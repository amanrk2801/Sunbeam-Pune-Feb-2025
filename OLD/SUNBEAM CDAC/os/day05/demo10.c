#include <stdio.h>
#include <unistd.h>

int main() {
	// 	|
	fork();
	//	|		|
	fork();
	//	|	|	|	|
	fork();
	//	||	||	||	||
	printf("cdac\n");
	return 0;
}


