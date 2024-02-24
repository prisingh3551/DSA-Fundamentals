public class SelectionSort {
    private static void selection_sort(int arr[], int n)
    {
        for (int i = 0; i < n-1; i++) 
        {
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
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
        selection_sort(arr, arr.length);
        print_array(arr, arr.length);
    }
}
