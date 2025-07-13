#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
	int ret, err, s;
	printf("parent started!\n");
	ret = fork();
	if(ret == 0) {
		// child process
		err = execl("/usr/bin/ls", "ls", "-l", NULL);
		if(err < 0) {
			perror("exec() failed");
			_exit(1);
		}
	}
	else {
		// parent process
		wait(&s);
		printf("child exit status: %d\n", WEXITSTATUS(s));
	}
	printf("parent completed!\n");
	return 0;
}

