package array.searchingsorting;

public class FloorAndCeilOfUnSortedArray {

	public static void main(String[] args) {
		int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
		int floor = arr[0];
		int ceil = arr[1];
		for(int i = 2; i<arr.length; i++) {
			if(arr[i] < floor)
				floor = arr[i];
			else if(arr[i] > ceil)
				ceil = arr[i];
		}
		System.out.println("Floor : " + floor + ", Ceil : " + ceil);

	}

}
