#include <iostream>
#include <string>
using namespace std;
//기본인수
void printLine(string text = "---", int count = 3) {
    for (int i = 0; i < count; i++)
        cout << text << endl;
}

int main() {
    printLine();
    printLine("===", 2);
    return 0;
}