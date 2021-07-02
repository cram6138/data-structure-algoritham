package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 8, 34, 22, 14, 9, 16, 2, 4, 33, 72, 1};
		System.out.println("before Sorting");
		print(arr);
		arr = sort(arr);
		System.out.println("After Sorting");
		print(arr);
	}

	private static int[] sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
