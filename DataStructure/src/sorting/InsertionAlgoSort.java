package sorting;

public class InsertionAlgoSort {

	public static void main(String[] args) {
		int arr[] = { 12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1 };
		System.out.println("before Sorting");
		print(arr);
		arr = sort(arr);
		System.out.println("After Sorting");
		print(arr);

	}

	private static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
