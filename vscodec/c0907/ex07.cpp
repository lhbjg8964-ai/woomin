#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> scores;
    int n, sum = 0;
    cout << "개수: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        int s;
        cin >> s;
        scores.push_back(s);
        sum += s;
    }
    cout << "합: " << sum << ", 평균: " << (double)sum / n << endl;
    return 0;
}
