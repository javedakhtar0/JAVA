import java.util.Arrays;

 class BubbleSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void dsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 57, 78, 23, 70};
        int n = arr.length;
        System.out.println("arr.length = " + arr.length);
        System.out.println("before sorting the array : " + Arrays.toString(arr));
        sort(arr, n);
        System.out.println("after sorting the array : " + Arrays.toString(arr));
        dsort(arr, n);
        System.out.println("descending order sorting the array : " + Arrays.toString(arr));
    }
}

