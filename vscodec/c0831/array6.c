#include <stdio.h>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int i, max = arr[0]; //배열에 첫번째 요소 10


    for (i = 1; i < 5; i++) {
        if(arr[i] > max){
            max = arr[i];
        }
    }
    printf("최대값 : %d\n", max);
    return 0;
}