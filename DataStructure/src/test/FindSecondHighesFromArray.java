package test;

import java.util.Arrays;

public class FindSecondHighesFromArray {

	public static void main(String[] args) {
		int[] number = {3, 6, 1, 23, 21, 43, 34, 56, 54};
		Arrays.sort(number);
		System.out.println(number[number.length-2]);
	}

}
