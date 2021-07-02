package array.searchingsorting;

import java.util.Scanner;

/*
 * Delete Operation In Sorted Array
 * 
 * Time Complexity of Insert Operation: O(n) [In the worst case all elements may have to be moved] 
 */
public class DeleteOperationInSortedArray {

	public static int findElemnet(int[] arr, int start, int end, int key) {
		if(start > end || arr[end-1] < key)
			return -1;
		
		int mid = (start+end)/2;
		
		if(arr[mid] == key)
			return mid;
		else if(arr[mid] > key)
			return findElemnet(arr, 0, mid-1, key);
		
		return findElemnet(arr, mid+1, end, key);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 6, 7, 8, 9, 10 };
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
		int pos = findElemnet(arr, 0, n, key);

		if (pos == -1) {
			System.out.println(" Not found ");
			return pos;
		} else {
			for (int i = pos; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
		}
		return n - 1;
	}

}
