public class BubbleSort{
    private static void bubble_sort(int arr[], int n)
    {
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    private static void print_array(int arr[], int n)
    {
        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 3, 9, 20, 23, 87, 99};
        bubble_sort(arr, arr.length);
        print_array(arr, arr.length);
    }
}