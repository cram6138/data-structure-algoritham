package test;

public class ReverseStringWithRecursion {

	public static void main(String[] args) {
		String st1 = "Bhajuram";
		
		System.out.println("String Before Reverse ::: " + st1);
		System.out.println("String After Reverse ::: " + reverse(st1));

	}

	private static String reverse(String st1) {
		if(st1 == null || st1.length() == 0)
			return st1;
		return reverse(st1.substring(1))+st1.charAt(0);
	}

}
