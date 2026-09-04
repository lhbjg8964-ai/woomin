#include <iostream>
#include <string>
using namespace std;

int main() {
    int age = 20;
    double height = 170.5;
    char grade = 'A';
    bool isStudent = true;
    string name = "김철수";

    cout << "이름: " << name << endl;
    cout << "나이: " << age << endl;
    cout << "키: " << height << endl;
    cout << "등급: " << grade << endl;
    cout << "재학 여부: " << isStudent << endl;  // 1 (true)

    return 0;
}