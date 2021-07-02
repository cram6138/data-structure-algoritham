package array.searchingsorting;

import java.util.Scanner;

/*
 * Search Operation In Unsorted Array
 */
public class InsertOperationInUnsortedArray {

	public static int[] insertElemnet(int[] arr, int capacity, int pos, int key) {
		if(capacity >= pos) {
			arr[pos] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {12, 34, 10, 6, 40};
		//Search for given value
		System.out.println(arr);
		int key = 50;
		int[] result = insertElemnet(arr, arr.length, 5, key);
		System.out.println(result);
		
	}

}
