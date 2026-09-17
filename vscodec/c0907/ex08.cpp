#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {3, 9, 1, 7, 5};
    int maxVal = v[0]; //3 
    for (int x : v) //v 요소를 하나씩 꺼내서 X 넣는다. 
        if (x > maxVal) maxVal = x;
    cout << "최댓값: " << maxVal << endl;
    return 0;
}