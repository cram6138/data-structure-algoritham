package sorting;

/*
 * Create max heap
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {9,7,2,5,1,12,23,6,41};
		System.out.println("Array Before Sort");
		print(arr);
		System.out.println("Array After creting Heap");
		heapify(arr, arr.length, 1);
		print(arr);
		heapSort(arr, arr.length);
		System.out.println("Array After Heap Sort");
		print(arr);
	}
	
	private static void heapSort(int[] arr, int n) {
		if(n==1) {
			return;
		}
		swapElement(arr, 0, n-1);
		heapify(arr, n-1, 1);
		heapSort(arr, n-1);
	}

	private static void heapify(int[] arr, int n, int child) {
		if(child == 0 || child >= n) {
			return;
		}
		int i = child;
		while(arr[i/2] < arr[i]) {
			swapElement(arr, i/2, i);
			i=i/2;
		}
		heapify(arr, n, ++child);
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
