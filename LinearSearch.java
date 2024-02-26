public class LinearSearch {
    private static void linearSearch(int arr[], int key)
    {
        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i] == key)
            {
                System.out.println("Element found at index : "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 3, 9, 20, 23, 87, 99};
        int key = 20;
        linearSearch(arr, key);
    }
}
