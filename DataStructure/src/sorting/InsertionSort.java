package sorting;

import java.util.Date;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int input[] = {6, 78, 65, 99, 12, 34, 54, 62, 2, 9, 22, 33, 60, 50, 88, 92, 102, 44, 11, 1, 15, 41, 31, 51, 61, 51};
		int n = 0;
		System.out.println("How many element do you want to sort ?");
		//n = sc.nextInt();
		int[] arr = new int[n = input.length];
		long start = new Date().getTime();
		for (int i = 0; i < n; i++) {
			//System.out.println("Enter "+ (i+1) + " element");
			//Thread.sleep(1000);
			arr = sort(arr, input[i], i);
			print(arr);
		}
		long end = 0;
		System.out.println("Start : " + start);
		System.out.println("End : " + (end = new Date().getTime()));
		System.out.println("Time to process " + n + " Element is : "+ (end - start));
		
	}
	
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
	}

	public static int[] sort(int[] arr, int input, int inputIndex) {
		if(inputIndex == 0)
			arr[0] = input;
		if (inputIndex > 0 && arr[inputIndex-1] <= input) {
			arr[inputIndex] = input;
			return arr;
		}
		for (int i = inputIndex-1; i > 0; i--) {
			if (input < arr[i] && input >= arr[i-1]) {
				arr[i+1] = arr[i];
				arr[i] = input;
				return arr;
			} else {
				arr[i+1] = arr[i];
				arr[i] = arr[i-1];
			}
		}
		arr[0] = input;
		
		return arr;
	}

}
