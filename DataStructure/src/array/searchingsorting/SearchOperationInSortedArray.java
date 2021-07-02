package array.searchingsorting;

import java.util.Scanner;

/*
 * Search Operation In Unsorted Array
 * 
 * Time Complexity of Search Operation: O(Log n) [Using Binary Search] 
 */
public class SearchOperationInSortedArray {

	public static int findElemnet(int[] arr, int start, int end, int key) {
		if(end < start || key < arr[0] || key > arr[arr.length-1])
			return -1;
		
		int mid = (start + end)/2;
		if(arr[mid] == key) {
			return mid;
		} else if(arr[mid] > key)	{
			return findElemnet(arr, start, mid, key);
		}
		return findElemnet(arr, mid+1, end, key);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 6, 7, 9, 10, 12, 15 };
		//Search for given value
		System.out.println("Enter Nubmer to search");
		int key = sc.nextInt();
		int result = findElemnet(arr, 0, arr.length, key);
		
		if(result != -1) {
			System.out.println(key + " Found at position " + result);
		} else {
			System.out.println(key + " Not Found");
		}
		
	}

}
