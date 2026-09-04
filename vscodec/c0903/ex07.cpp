#include <iostream>
#include <string>
using namespace std;
int main() {
    int age;
    string name;
    cout << "나이: ";
    cin >> age; //공백을 만나면 입력끝(공백없는 단어입력)
    cin.ignore(); //버퍼지우기
    cout << "이름(공백 가능): ";
    getline(cin, name); //한줄입력 (공백을 포함한 한 줄 입력)
    cout << name << " (" << age << "세)" << endl;
    return 0;
}