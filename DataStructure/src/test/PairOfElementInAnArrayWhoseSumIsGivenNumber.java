package test;

import java.util.Arrays;

public class PairOfElementInAnArrayWhoseSumIsGivenNumber {

	public static void main(String[] args) {
		int num[] = {12, 23, 125, 41, -75, 38, 27, 11, 50};
		Arrays.parallelSort(num);
		getPair(num, 50);
	}

	private static void getPair(int[] num, int givenNum) {
		int i = 0;
		int j = num.length-1;
		
		while (i<j) {
			if (num[i] + num[j] == givenNum) {
				System.out.println(num[i] +" + "+ num[j] + " = "+ givenNum);
				i++;
				j--;
			} else if(num[i] + num[j] < givenNum) {
				i++;
			} else if (num[i] + num[j] > givenNum){
				j--;
			}
		}
	}
}
