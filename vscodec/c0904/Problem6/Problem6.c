#include <stdio.h>

int main(void) {
    int arr[10];
    int sum = 0;
    int count = 0;
    float average;

    for (int i = 0; i < 10; i++) {
        printf("%d번째 정수 입력: ", i + 1);

        if (scanf("%d", &arr[i]) != 1) {
            printf("정수를 입력해야 합니다.\n");
            return 1;
        }

        sum += arr[i];
    }

    average = (float)sum / 10;

    for (int i = 0; i < 10; i++) {
        if (arr[i] >= average) {
            count++;
        }
    }

    printf("평균: %.2f\n", average);
    printf("평균 이상인 값의 개수: %d\n", count);

    return 0;
}