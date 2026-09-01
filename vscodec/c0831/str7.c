#include <stdio.h>
#include <string.h>
//문자열 연결
int main(){
    char str1[] = "Hellow";
    char str2[] = "Hellow";
    char str3[] = "World";

    if(strcmp(str1, str2) == 0 ){
    printf("str1과 str2는 같습니다.\n");
    }
    if(strcmp(str1, str3) != 0 ){
    printf("str1과 str3는 다릅니다.\n");
    }
    return 0;
}