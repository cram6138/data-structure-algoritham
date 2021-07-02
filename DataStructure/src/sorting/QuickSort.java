package sorting;

/*
 *  Quick Sort
 */
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1};
		System.out.println("before Sorting");
		print(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting");
		print(arr);
	}

	private static void quickSort(int[] arr, int l, int h) {
		if(h<l) {
			return;
		}
		int pi = partition(arr, l, h);
		quickSort(arr, l, pi-1);
		quickSort(arr, pi+1, h);
	}

	private static int partition(int[] arr, int l, int h) {
		int start = l, end = h;
		int pivot = arr[start];
		while(start<end) {
			while(arr[start] <= pivot && start<end) {
				start++;
			}
			while(arr[end]> pivot) {
				end--;
			}
			if(start<end) {
				swapElement(arr, start, end);
			}
		}
		swapElement(arr, l, end);
		return end;
	}

	private static void swapElement(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
