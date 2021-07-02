package test;

public class FindLCMOfTwoString {

	public static void main(String[] args) {
		String st1 = "abcabcabc";
		String st2 = "abc";
		findLcm(st1, st2);
	}

	private static void findLcm(String st1, String st2) {
		if (st1.length() > st2.length()) {
			if(!st1.contains(st2)) {
				System.out.println("Common string not found");
				return;
			}
			findSmallestCommonString(st2, st1);
		} else if(st1.length() < st2.length())  {
			if(!st2.contains(st1)) {
				System.out.println("Common string not found");
				return;
			}
			findSmallestCommonString(st1, st2);
		} else {
			findSmallestCommonString(st1, st2);
		}
		
	}

	private static void findSmallestCommonString(String smallStr, String bigStr) {
		for (int i = 0; i<smallStr.length(); i++) {
			String commonString = smallStr.substring(0, i+1);
			if(smallStr.replaceAll(commonString, "").length() == 0 && bigStr.replaceAll(commonString, "").length() == 0) {
				System.out.println("Common String Found that is : " + commonString);
				return;
			}
		}
		System.out.println("Common string not found");
	}

}
