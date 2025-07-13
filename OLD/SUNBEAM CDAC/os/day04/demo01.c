#include <stdio.h>
#include <unistd.h>

int main() {
	int ret;
	printf("program started..\n");
	ret = fork();
	printf("fork() returned: %d\n", ret);
	printf("program completed..\n");
	return 0;
}

// > gcc demo01.c
// > ./a.out

