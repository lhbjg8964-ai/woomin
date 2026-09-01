#include <stdio.h>
#include <string.h>

int main(){
    char str[] = "Hellow";
    char dest[20];

    strcpy(dest, str);
    
    printf("복사된 문자열: %s\n", strlen(str));
    return 0;
}