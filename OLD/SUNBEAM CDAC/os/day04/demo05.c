#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

// _exit() syscall
// wait() syscall
int main() {
	int ret, i, s;
	printf("program started..\n");
	ret = fork();
	printf("fork() returned: %d\n", ret);
	if(ret == 0) {
		// child process
		for(i=1; i<=10; i++) {
			printf("child: %d\n", i);	
			sleep(1);
		}
		_exit(5);
	}
	else {
		// parent process
		for(i=1; i<=20; i++) {
			printf("parent: %d\n", i);	
			sleep(1);
			if(i == 10) {
				wait(&s);
				printf("child exit status: %d\n", WEXITSTATUS(s));
			}
		}
	}
	printf("program completed..\n");
	return 0;
}

// > gcc demo01.c
// > ./a.out

