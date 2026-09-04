#include <stdio.h>
int main() {
    FILE *fp = fopen("numbers.txt", "r");
    int num, sum = 0;
    
    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }
    //fscanf(fp, "%d", &num)  fp에서 정수하나 읽어서 num 저장 
     while (fscanf(fp, "%d", &num) != EOF) {
        printf("%d ", num);
        sum += num;
    }
    
    printf("\n합계: %d\n", sum);
  
    fclose(fp);
    return 0;
}