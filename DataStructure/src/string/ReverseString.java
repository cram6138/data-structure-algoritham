package string;

public class ReverseString {

	public static void main(String[] args) {
		String st = "Bhajuram Chaurasiya";
		System.out.println(reverse("", st));
	}

	private static String reverse(String newString, String st) {
		if(st.length() == 0) {
			return newString;
		}
		newString =  st.charAt(0) + newString;
		return reverse(newString, st.substring(1));
	}

}
