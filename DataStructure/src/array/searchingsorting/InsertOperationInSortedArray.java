package array.searchingsorting;

/*
 * Insert Operation In Sorted Array
 * 
 * Time Complexity of Search Operation: O(n) [In the worst case all elements may have to be moved]  
 */
public class InsertOperationInSortedArray {

	public static void main(String[] args) {
		int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;
        
        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
		n = insertElemnet(arr, n, key, capacity);
		
		System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		
	}
	private static int insertElemnet(int[] arr, int n, int key, int capacity) {
		if(n >= capacity) {
			return n;
		}
		int i;
		for(i = n-1; (i >= 0 && arr[i] > key); i--) {
			arr[i+1] = arr[i];
		}
		arr[i+1] = key;
		
		return n+1;
	}

}
