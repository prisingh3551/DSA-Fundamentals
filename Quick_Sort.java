public class Quick_Sort {
	static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int pos = low;
		for(int i = low; i < high; ++i)
		{
			if(pivot > arr[i])
			{
				int tmp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = tmp;
				pos++;
			}
		}
		arr[high] = arr[pos];
		arr[pos] = pivot;
		return pos;
	}
	static void quickSort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	public static void printArr(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args)
	{
        int arr[] = {1, 5, 7, 8, 3, 9, 20, 23, 87, 99};
        System.out.println("Given array is");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array is");
        printArr(arr);
	}
}
