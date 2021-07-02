package ProblemsAndSolutions;

/*
 * Q. Given an unsorted array A of size N that contains only non-negative integers, 
 *    find a continuous sub-array which adds to a given number S.
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,5};
		int sum = 12;
		String arrStr = findSubArray(arr, 0, arr.length-1, sum);
		System.out.println(arrStr);
	}

	private static String findSubArray(int[] arr, int start, int end, int sum) {
		int countSum = 0;
		String sumIndexStr = "";
		//System.out.println("at start : " + start + " " + end);
		for(int i = start; i<= end; i++) {
			sumIndexStr += i+ " ";
			countSum += arr[i];
		}
		
		if(countSum == sum) {
			System.out.println(sumIndexStr);
		}
		
		System.out.println("before If : " + start + " " + end);
		if(start != end) {
			return findSubArray(arr, ++start, end, sum);
		} else if(end >0) {
			return findSubArray(arr, 0, --end, sum);
		}
		
		return "No Such Sub Array found";
	}

}
