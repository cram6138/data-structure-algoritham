package string;

public class DuplicateCharecterCountInAString {

	public static void main(String[] args) {
		String st1 = "hsdfhsfjhfshfghguayuwyurhjfbsddahdlafesfshfjhsfgs";
		printDuplicateCount(st1);
	}

	private static void printDuplicateCount(String st1) {
		while (st1.length() > 1) {
			String temp = st1.replaceAll(st1.charAt(0)+"", "");
			int count = st1.length() - temp.length();
			if( count > 1) {
				System.out.println(st1.charAt(0) + " : " + count);
			}
			printDuplicateCount(temp);
		}
		
	}

}
