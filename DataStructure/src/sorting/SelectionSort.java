package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// finding minimum element in array and placing it at begnning
		int arr[] = {12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1};
		System.out.println("before Sorting");
		print(arr);
		//arr = sort(arr);
		selectionSort(arr, 0);
		System.out.println("After Sorting");
		print(arr);
	}

	private static int[] sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int min = arr[i];
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j] < min) {
					int temp = min;
					min = arr[j];
					arr[j] = temp;
				}
			}
			arr[i] = min;
		}
		return arr;
	}
	
	private static void selectionSort(int[] arr, int index) {
		if(index >= arr.length) {
			return;
		}
		int min = arr[index];
		for(int i=index+1; i<arr.length; i++) {
			if(arr[i]<min) {
				int temp = min;
				min = arr[i];
				arr[i] = temp;
			}
		}
		arr[index] = min;
		selectionSort(arr, ++index);
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
