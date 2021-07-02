package ProblemsAndSolutions;

/*
 *  Q. Find position of an element in a sorted array of infinite numbers
 */
public class PosOfAnElementInInfiniteSortedArray {

	public static void main(String[] args) {
		
		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int position = findPosition(arr, 100);
		
		if(position == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element pound at position : " + position);
	}

	private static int findPosition(int[] arr, int key) {
		//find upper bound of array to perform binary search
		int l=0, h=1;
		int val = arr[0];
		while (val < key) {
			l = h;
			if(2*h < arr.length-1) {
				h = 2*h;
			} else {
				h = arr.length-1;
			}
			val = arr[h];
		}
		return searchElement(arr, key, l, h);
	}

	private static int searchElement(int[] arr, int key, int l, int h) {
		if(l>=h) {
			return -1;
		}
		int mid = (l+h)/2;
		if(key == arr[mid]) {
			return mid;
		} else if(key > arr[mid]) {
			return searchElement(arr, key, mid+1, h);
		}
		return searchElement(arr, key, l, mid-1);
	}

}
