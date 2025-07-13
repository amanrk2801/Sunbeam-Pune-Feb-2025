#include<stdio.h> 
#define VER 1
int main() {
 #ifndef VER
 #error "VER not defined"
 #endif
 #if VER == 1
 printf("This is Version 1.\n");
 #elif VER == 2
 printf("This is Version 2.\n");
 #else
 printf("This is 3+ Version.\n");
 #endif
 return 0;
}