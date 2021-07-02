package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1 };
		System.out.println("before Sorting");
		print(arr);
		arr = sort(arr, 0, arr.length - 1);
		System.out.println("After Sorting");
		print(arr);

	}

	private static int[] sort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			arr = merge(arr, start, mid, end);
		}
		return arr;
	}

	private static int[] merge(int[] arr, int start, int mid, int end) {

		// find length of sub array
		int length1 = mid - start + 1;
		int length2 = end - mid;
		// create two tem array
		int[] temp1 = new int[length1];
		int[] temp2 = new int[length2];

		// copy element into subarray
		for (int i = 0; i < length1; ++i) {
			temp1[i] = arr[start + i];
		}
		// copy element into subarray
		for (int i = 0; i < length2; ++i) {
			temp2[i] = arr[mid + 1 + i];
		}
		// merge subarray
		int i = 0;
		int j = 0;
		int k = start;
		while (i < length1 && j < length2) {
			if (temp1[i] >= temp2[j]) {
				arr[k] = temp2[j];
				j++;
			} else {
				arr[k] = temp1[i];
				i++;
			}
			k++;
		}
		
		while (i<length1) {
			arr[k] = temp1[i];
			i++;
			k++;
		}
		
		while (j<length2) {
			arr[k] = temp2[j];
			j++;
			k++;
		}
		return arr;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
