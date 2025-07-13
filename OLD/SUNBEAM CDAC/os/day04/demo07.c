#include <stdio.h>
#include <pthread.h>
#include <unistd.h>

void* thread1_func(void *param) {
	int i;
	for(i=1; i<=10; i++) {
		printf("th_1: %d\n", i);
		sleep(1);
	}
	return NULL;
}

void* thread2_func(void *param) {
	int i;
	for(i=1; i<=10; i++) {
		printf("th_2: %d\n", i);
		sleep(1);
	}
	return NULL;
}

int main() {
	int i, ret;
	pthread_t t1, t2;
	//thread1_func(NULL); // main thread calling thread1_func()
	ret = pthread_create(&t1, NULL, thread1_func, NULL);
	ret = pthread_create(&t2, NULL, thread2_func, NULL);
	for(i=1; i<=10; i++) {
		printf("main: %d\n", i);
		sleep(1);
	}
	return 0;
}

// > gcc demo07.c -lpthread
// > ./a.out






