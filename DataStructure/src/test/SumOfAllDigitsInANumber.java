package test;

public class SumOfAllDigitsInANumber {

	public static void main(String[] args) {
		int number = 322284;
		System.out.println(countDigits(number));
	}

	private static int countDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number%10;
			number = number/10;
		}
		return sum;
	}

}
