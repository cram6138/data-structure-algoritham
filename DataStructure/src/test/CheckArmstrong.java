package test;

public class CheckArmstrong {

	public static void main(String[] args) {
		int n = 1536;
		System.out.println(giveResultValue(n) == n);
	}

	private static int giveResultValue(int n) {
		int amsNumber = 0;
		while (n>0) {
			amsNumber += Math.pow(n%10, 3);
			n = n/10;
		}
		return amsNumber;
	}

}
