package array.searchingsorting;

import java.util.Scanner;

/*
 * Search Operation In Unsorted Array
 */
public class SearchOperationInUnsortedArray {

	public static int findElemnet(int[] arr, int n, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {12, 34, 10, 6, 40};
		//Search for given value
		System.out.println("Enter Nubmer to search");
		int key = sc.nextInt();
		int result = findElemnet(arr, arr.length, key);
		
		if(result != -1) {
			System.out.println(key + " Found at position " + result);
		} else {
			System.out.println(key + " Not Found");
		}
		
	}

}
