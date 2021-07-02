package array.searchingsorting;

public class FindMinAndMaxUsingDivideAndConquer {

	public static void main(String[] args) {
		int a[] = { 70, 250, 50, 80, 140, 12, 14 };
		int min, max;

		min = findMinDAC(a, 0, a.length);
		max = findMaxDAC(a, 0, a.length);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
	}

	private static int findMinDAC(int[] a, int index, int l) {
		int min;
		// start base condition
		if(index >= l-2) {
			if(a[index] < a[index+1]) {
				return a[index];
			}
			return a[index+1];
		}
		//end base condition
		
		//recursion function call
		min = findMinDAC(a, index+1, l);
		
		// combining solutions
		if(min > a[index+1])
			return a[index+1];
		return min;
	}

	private static int findMaxDAC(int[] a, int index, int l) {
		int max;
		if(index >= l-2) {
			if(a[index] > a[index+1]) {
				return a[index];
			}
			return a[index+1];
		}
		
		max = findMaxDAC(a, index+1, l);
		if(max < a[index+1])
			return a[index+1];
		return max;
	}

}
