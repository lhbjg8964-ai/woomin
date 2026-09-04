#include <stdio.h>

int main() {
    FILE *fp = fopen("data.txt", "r");
    char buffer[100]; //한 줄의 내용 임시로 저장할 공간
    // 99문자 저장  마지막 끝에 '\0' (끝임을 알림)

    
    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }
    
    while (fgets(buffer, 100, fp) != NULL) {
        printf("%s", buffer);
        //buffer -> Hello File \n
        //fgets() 파일에서 한 줄을 읽음
    }
    
    fclose(fp);
//     fopen() → 파일 열기
// fgets() → 파일 읽기
// printf() → 화면에 출력
// fclose() → 파일 닫기
    return 0;
}