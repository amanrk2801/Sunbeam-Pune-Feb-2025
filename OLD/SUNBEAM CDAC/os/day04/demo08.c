#include <stdio.h>
#include <pthread.h>
#include <unistd.h>

int cnt=0;

void* thread1_func(void *param) {
	int i, newcnt;
	for(i=1; i<=10000; i++) {
		newcnt = cnt + 1;
		cnt = newcnt;
		printf("th_incr: %d\n", cnt);
		//sleep(1);
	}
	return NULL;
}

void* thread2_func(void *param) {
	int i, newcnt;
	for(i=1; i<=10000; i++) {
		newcnt = cnt - 1;
		cnt = newcnt;
		printf("th_decr: %d\n", cnt);
		//sleep(1);
	}
	return NULL;
}

int main() {
	int i, ret;
	pthread_t t1, t2;
	//thread1_func(NULL); // main thread calling thread1_func()
	ret = pthread_create(&t1, NULL, thread1_func, NULL);
	ret = pthread_create(&t2, NULL, thread2_func, NULL);
	printf("press enter to exit...\n");
	getchar();
	printf("final count: %d\n", cnt);
	return 0;
}

// > gcc demo07.c -lpthread
// > ./a.out






