public class Binary_Search {
    private static boolean isPresent(int arr[], int n)
    {
        int low = 0, high = arr.length;
        int mid;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(arr[mid] == n) return true;
            else if(arr[mid] < n)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {

        int n = 3;
        int arr[]= {1, 2, 3, 4, 5};
        System.out.println(isPresent(arr, n));
    }
}
