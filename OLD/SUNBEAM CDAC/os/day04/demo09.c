#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
#include <semaphore.h>

int cnt=0;
sem_t s;

void* thread1_func(void *param) {
	int i, newcnt;
	for(i=1; i<=10000; i++) {
		sem_wait(&s); // P(s);
		newcnt = cnt + 1;
		cnt = newcnt;
		printf("th_incr: %d\n", cnt);
		sem_post(&s); // V(s);
		//sleep(1);
	}
	return NULL;
}

void* thread2_func(void *param) {
	int i, newcnt;
	for(i=1; i<=10000; i++) {
		sem_wait(&s); // P(s);
		newcnt = cnt - 1;
		cnt = newcnt;
		printf("th_decr: %d\n", cnt);
		sem_post(&s); // V(s);
		//sleep(1);
	}
	return NULL;
}

int main() {
	int i, ret;
	pthread_t t1, t2;
	sem_init(&s, 0, 1); // init sema with initial cnt=1
	//thread1_func(NULL); // main thread calling thread1_func()
	ret = pthread_create(&t1, NULL, thread1_func, NULL);
	ret = pthread_create(&t2, NULL, thread2_func, NULL);
	printf("press enter to exit...\n");
	getchar();
	printf("final count: %d\n", cnt);
	sem_destroy(&s); // destroy sema
	return 0;
}

// > gcc demo07.c -lpthread
// > ./a.out






