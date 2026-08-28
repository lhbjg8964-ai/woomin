#include <stdio.h>
int main(){
    char grade;

    printf("등급을 입력하세요 :");
    scanf("%c", &grade);
    printf("등급 : %c\n", grade);
return 0;
}

// & 붙이는 이유
// scanf()는 입력받은 값을 변수에 저장해야 하기 떄문에 변수의 주소