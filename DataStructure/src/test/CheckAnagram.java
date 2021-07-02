package test;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";
		
		char ch1[] = str1.replaceAll(" ", "").toLowerCase().toCharArray();
		char ch2[] = str2.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (ch1.length != ch2.length) {
			System.out.println("Given string is not an anagram");
		} else if (Arrays.equals(ch1, ch2)) {
			System.out.println("Given string is an anagram");
		} else {
			System.out.println("Given string is not an anagram");
		}
	}

}
