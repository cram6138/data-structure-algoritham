package ProblemsAndSolutions;

public class FindCommonEleIn3SortedArrays {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 5}; //{1, 5, 10, 20, 40, 80}; 
		int ar2[] = {3, 4, 5, 5, 10} ; //{6, 7, 20, 80, 100} ;
		int ar3[] = {5, 5, 10, 20}; //{3, 4, 15, 20, 30, 70, 80, 120}; 
		
		findCommonElement(ar1, 0, ar2, ar3);

	}

	private static void findCommonElement(int[] ar1, int index, int[] ar2, int[] ar3) {
		if(index >= ar1.length) {
			return;
		}
		boolean found1 = searchElement(ar2, 0, ar2.length, ar1[index]);
		boolean found2 = false;
		
		if(found1) {
			found2 = searchElement(ar3, 0, ar3.length, ar1[index]);
			if(found2)
				 System.out.println(ar1[index]);
		}
		findCommonElement(ar1, ++index, ar2, ar3);
	}

	public static boolean searchElement(int[] arr, int start, int end, int key) {
		if(end <= start  || key < arr[0] || key > arr[arr.length-1])
			return false;
		
		int mid = (start + end)/2;
		if(arr[mid] == key) {
			return true;
		} else if(arr[mid] > key)	{
		return searchElement(arr, start, mid, key);
		}
		return searchElement(arr, mid+1, end, key);
		
	}
}
