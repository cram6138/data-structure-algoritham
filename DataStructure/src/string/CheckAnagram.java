package string;

public class CheckAnagram {

	public static void main(String[] args) {
		boolean isAnagram = isStringAnagram("Bhajuramhdsfh".toLowerCase(), "hhsdfmarbhauj".toLowerCase());
		if (isAnagram) {
			System.out.println("Given string are Anagram");
		} else {
			System.out.println("Given string are not anagram");
		}
	}

	private static boolean isStringAnagram(String st1, String st2) {
		if (st1.length() != st2.length()) {
			return false;
		}
		
		if(st1.length() <= 1) {
			return true;
		}
		return isStringAnagram(st1.replaceFirst(st1.charAt(0)+"", ""), st2.replaceFirst(st2.charAt(0)+"", ""));
	}
	
	public static boolean isStringEmpty(String st) {
		return st == null || st.length() < 1;
	}

}
