package array.reverse;

/*
 * Time Complexity : O(n)
 */
public class ReverseArrayByElementD {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8,9};
		
		System.out.println("before reverse");
		for(int e: arr)
			System.out.print(e+ " ");
		// Method 1
		//	 reverseArrayByDElemment(arr, arr.length, 3);
		//Method 2
		reverseArrayByElemmentD_M2(arr, 0, 2);//reverse first sub array
		reverseArrayByElemmentD_M2(arr, 3, arr.length-1);// reverse seccond subarray
		reverseArrayByElemmentD_M2(arr, 0, arr.length-1);// reverse complete subarray

		System.out.println("\nAfter reverse");
		for(int e: arr)
			System.out.print(e+ " ");
	}

	private static void reverseArrayByElemmentD_M2(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	private static int[] reverseArrayByDElemment(int[] arr, int length, int d) {
		if(d==0) {
			return arr;
		}
		int front = arr[0];
		for(int i=0; i<length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[length-1] = front;
		return reverseArrayByDElemment(arr, length, --d);
	}

}
