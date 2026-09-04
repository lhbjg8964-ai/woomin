#include <stdio.h>
#include <string.h>

int main(void) {
    char str[101];
    char target;
    int count = 0;

    printf("문자열 입력: ");
    fgets(str, sizeof(str), stdin);

    str[strcspn(str, "\n")] = '\0';

    printf("찾을 문자 입력: ");
    scanf(" %c", &target);

    for (int i = 0; i < (int)strlen(str); i++) {
        if (str[i] == target) {
            count++;
        }
    }

    printf("%c가 나타나는 횟수: %d\n", target, count);

    return 0;
}