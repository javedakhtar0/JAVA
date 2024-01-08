#include <iostream>
using namespace std;

void sort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
}

void dsort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] < arr[j + 1])
                swap(arr[j], arr[j + 1]);
}

int main()
{
    int arr[] = {33, 57, 78, 23, 70};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "sizeof(arr) = " << sizeof(arr);
    cout << endl
         << "sizeof(arr[0]) = " << sizeof(arr[0])<<endl;
    cout << "before sorting the array :";
    for (int i = 0; i < n; i++)
        cout << arr[i] << "     ";
    sort(arr, n);
    cout << endl
         << "after sorting the array :";
    for (int i = 0; i < n; i++)
        cout << arr[i] << "     ";

    dsort(arr, n);
    cout << endl
         << "descending order sorting the array :";
    for (int i = 0; i < n; i++)
        cout << arr[i] << "     ";
    return 0;
}
