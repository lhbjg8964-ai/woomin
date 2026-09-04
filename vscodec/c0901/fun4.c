#include <stdio.h>
//값 전달 - call by value
void changeValue(int x){ //num을 복사해서 전달
    x = 100; //함수내부에서만 x 가 100변경
    printf("함수 내부: %d\n",x);
}
int main(){
    int num = 10;
    changeValue(num);
    printf("함수 호출후 : %d\n", num);//10
    return 0;
}