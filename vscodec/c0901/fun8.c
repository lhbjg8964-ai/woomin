#include <stdio.h>

int global = 100;  // 전역변수

void func1() {
    global = 200;
    printf("func1: %d\n", global); //200
}

void func2() {
    printf("func2: %d\n", global); //200
}
int main() {
    printf("main: %d\n", global);//100
    func1();
    func2();
    printf("main: %d\n", global); //200
    return 0;
}