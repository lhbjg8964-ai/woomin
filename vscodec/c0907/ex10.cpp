#include <iostream>
#include <string>
using namespace std;

int main() {
    string s = "abcde", rev = "";
    for (int i = s.length() - 1; i >= 0; i--) //s[4] = e  s[3] = d
        rev += s[i];
    cout << rev << endl;
    return 0;
}