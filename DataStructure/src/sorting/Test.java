package sorting;


public class Test {

	public static void main(String[] args) {
		int[] arr = {9,5,3,11,8,1,23,2};
		printArr(arr);
		//selectionSort(arr, 0);
		bubbleSort(arr, 1);
		printArr(arr);
	}

	/*
	 * Bubble Sort
	 */
	private static void bubbleSort(int[] arr, int i) {
		if(i>=arr.length) {
			return;
		}
		for(int k = 0; k<arr.length-i; k++) {
			if(arr[k]>arr[k+1]) {
				int temp = arr[k];
				arr[k] = arr[k+1];
				arr[k+1] = temp;
			}
		}
		bubbleSort(arr, ++i);
	}

	/*
	 * Selection Sort
	 */
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

	private static void printArr(int[] arr) {
		for(int e: arr) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

}
