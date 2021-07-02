package ProblemsAndSolutions;

import java.util.Arrays;
import java.util.HashSet;

public class CountTriplets {

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,5,4,9,10,11};

		Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<Integer>();
		for(int e: arr) {
			set.add(e);
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length && i != j; j++) {
				int sum = arr[i] + arr[j];
				if(set.contains(sum)) {
					System.out.println(arr[i] + " + "+ arr[j] + " = " + sum);
				}
			}
		}
	}
}
