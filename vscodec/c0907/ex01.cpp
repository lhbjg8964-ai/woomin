#include <iostream>
using namespace std;
//1~10 합
int main() {
    int sum = 0;
    for (int i = 1; i <= 10; i++)
        sum += i;
    cout << "합: " << sum << endl;
    return 0;
}