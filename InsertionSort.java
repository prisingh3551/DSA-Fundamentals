public class InsertionSort {
    private static void insertion_sort(int arr[], int n)
    {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    private static void print_array(int arr[], int n)
    { 
        System.out.print("Sorted Array : ");
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 3, 9, 20, 23, 87, 99};
        insertion_sort(arr, arr.length);
        print_array(arr, arr.length);
    }
}
