package array.searchingsorting;

import java.util.Scanner;

/*
 * Search Operation In Unsorted Array
 */
public class DeleteOperationInUnsortedArray {

	public static int findElemnet(int[] arr, int n, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 12, 34, 10, 6, 40 };
		// Search for given value
		System.out.println("Enter Nubmer to Delete");
		int key = sc.nextInt();

		System.out.print("Before Delete : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int n = deleteElement(arr, arr.length, key);

		System.out.print("After Delete : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int deleteElement(int[] arr, int n, int key) {
		int pos = findElemnet(arr, n, key);

		if (pos == -1) {
			System.out.println(" Not found ");
		}
		for (int i = pos; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
	}

}
