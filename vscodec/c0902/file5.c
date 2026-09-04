#include <stdio.h>
struct Student {
    char name[20];
    int age;
    int score;
};
//파일 쓰기
int main() {
    FILE *fp = fopen("student.txt", "w"); //w  파일이 없으면 만들어라
    //파일 있으면 -> 기존내용 삭제후 새로 저장
     struct Student students[3] = {
        {"홍길동", 20, 85},
        {"김철수", 22, 95},
        {"이영희", 21, 75}
    };
    int i; 
    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }
    
 for (i = 0; i < 3; i++) {
        fprintf(fp, "%s %d %d\n", 
                students[i].name, students[i].age, students[i].score);
    }  
    fclose(fp);
    printf("학생 정보 저장 완료!\n");
      return 0;
}