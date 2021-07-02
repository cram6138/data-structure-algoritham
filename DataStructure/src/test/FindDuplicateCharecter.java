package test;

public class FindDuplicateCharecter {

	public static void main(String[] args) {
		String str = "ncdsjfhsiufiuehdhakjjfisjfjjfjs";
		
		while (str.length()>1) {
			String str2 = str.substring(1).replaceAll(str.charAt(0)+"", "");
			if (str.length() - str2.length() >1) {
				System.out.println(str.charAt(0) + " : " + (str.length() - str2.length()));
			}
			str = str2;
		}
	}
}
