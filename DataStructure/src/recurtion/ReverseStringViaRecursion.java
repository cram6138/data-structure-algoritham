package recurtion;

public class ReverseStringViaRecursion {

	public static void main(String[] args) {
		String str1 = "Bhajuramc";
		System.out.println("Before Reverse :: " + str1);
		System.out.println("After Reverse :: " + reverse(str1));
	}

	private static String reverse(String str1) {
		if(str1 == null || str1.length() == 0) {
			return str1;
		}
		return reverse(str1.substring(1)) + str1.charAt(0);
	}

}
