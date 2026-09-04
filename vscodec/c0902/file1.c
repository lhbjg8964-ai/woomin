#include <stdio.h>
//파일 쓰기
int main() {
    FILE *fp = fopen("data.txt", "w"); //w  파일이 없으면 만들어라
    //파일 있으면 -> 기존내용 삭제후 새로 저장
    
    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }
    
    fprintf(fp, "Hello File\n");
    fprintf(fp, "안녕하세요 파일입니다.\n");
    
    fclose(fp);
    printf("파일 쓰기 완료!\n");
      return 0;
}