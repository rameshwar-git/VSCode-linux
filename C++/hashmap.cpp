#include <iostream>
#include <set>
#include <vector>
using namespace std;
int main() {
    // Example 2D set
    int arr[4];

    for (int i=0;i<4;i++)
        arr[i]=0;

    arr[1]=arr[1]+1;
    for (int i=0;i<4;i++)
        cout<<arr[i];
    // Convert to 2D vector
    cout<<endl;
    return 0;
}