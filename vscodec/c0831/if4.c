#include <stdio.h>

int main() {
    int a, b, c;
    int max;
    printf("세가지 숫자를 입력하세요 : ");
    scanf("%d %d %d", &a, &b, &c);
    
    max = a; //처음에는 a가 가장 큰수라고 가정
    if (b > max){
        max = b;
    }
    if (c > max){
        max = c;
    }
    return 0;
}