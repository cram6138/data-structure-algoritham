package ProblemsAndSolutions;

import java.util.Date;

/*
 * Q. Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. 
 * 	  Merge them in sorted order without using any extra space. Modify arr1 so that it contains 
 *    the first N elements and modify arr2 so that it contains the last M elements.
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7,21,24,25,28,31,33,36}; 
		int arr2[] = {4, 6, 8, 9,12,20,22,23,26,30,32,34,35};
		long start = new Date().getTime();
		merge(arr1, arr2);
		System.out.println(new Date().getTime() - start);
		printArray(arr1);
		printArray(arr2);
	}

	private static void merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] arr = new int[arr1.length + arr2.length];
		for(; i < arr1.length && j < arr2.length; k++) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
		}
		
		while(k<arr.length) {
			if(i<arr1.length) {
				arr[k] = arr1[i];
				i++;
			}
			
			if(j<arr2.length) {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		splitArray(arr1, 0, arr1.length-1, arr);
		splitArray(arr2, arr1.length, arr.length-1, arr);
		
	}

	private static void splitArray(int[] target, int start, int end, int[] arr) {
		for(int i = 0; i<target.length; i++) {
			target[i] = arr[start];
			start++;
		}
	}

	private static void printArray(int[] arr) {
		for(int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
