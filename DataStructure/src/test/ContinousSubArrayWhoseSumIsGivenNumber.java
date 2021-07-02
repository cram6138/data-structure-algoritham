package test;

public class ContinousSubArrayWhoseSumIsGivenNumber {

	public static void main(String[] args) {
		int input[] = {12, 5, 31, 13, 21, 8};
		findSubArray(input, 49);
	}

	private static void findSubArray(int[] input, int givenNumber) {
		for (int i=0; i<input.length; i++) {
			int sum = input[i];
			for (int j=i+1; j<input.length; j++) {
				sum += input[j];
				if (sum == givenNumber) {
					for (int k = i; k<=j; k++) {
						System.out.print(input[k]+" ");
					}
				} else if (sum < givenNumber) {
					continue;
				} else if (sum > givenNumber) {
					break;
				}
			}
		}
		
	}

}
