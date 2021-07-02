package sorting;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		int arr[] = {12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1};
		System.out.println("before Sorting");
		print(arr);
		arr = recursveSort(arr, arr.length);
		System.out.println("After Sorting");
		print(arr);
	}

	private static int[] recursveSort(int[] arr, int length) {
		if(length == 0) {
			return arr;
		}
			
		for(int j=1; j<length; j++) {
			if(arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
		return recursveSort(arr, --length);
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
