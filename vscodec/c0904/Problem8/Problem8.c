#include <stdio.h>

int main(void) {
    int arr[8];
    int even[8];
    int odd[8];
    int evenCount = 0;
    int oddCount = 0;
    printf("정수 8개를 입력하세요: ");
    for (int i = 0; i < 8; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < 8; i++) {
        if (arr[i] % 2 == 0) {
            even[evenCount] = arr[i];
            evenCount++;
        } else {
            odd[oddCount] = arr[i];
            oddCount++;
        }
    }
    printf("짝수: ");
    if (evenCount == 0) {
        printf("없음");
    } else {
        for (int i = 0; i < evenCount; i++) {
            printf("%d ", even[i]);
        }
    }
    printf("\n");

    printf("홀수: ");
    if (oddCount == 0) {
        printf("없음");
    } else {
        for (int i = 0; i < oddCount; i++) {
            printf("%d ", odd[i]);
        }
    }
    printf("\n");

    return 0;
}