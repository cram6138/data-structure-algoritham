package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInAnArrayUsingStream {

	public static void main(String[] args) {
		int arr[] = {5, 6, 9, 5, 5, 12, 54, 35, 12};
		Set<Integer> uniqeElement = new HashSet<Integer>();
		
		Set<Integer> duplicateElement = Arrays.stream(arr)
				.filter(i -> !uniqeElement.add(i))
				.boxed()
				.collect(Collectors.toSet());
		System.out.println(duplicateElement);
	}

}
