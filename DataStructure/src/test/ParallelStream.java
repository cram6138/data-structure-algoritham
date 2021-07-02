package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {

	public static void main(String[] args) {
		String st = "hfjhsjfsjkahfsagfhsfshfghsfshfkjsajfhdsfhdf";
		List<Character> vowel = new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		IntStream stream = st.chars();

	}

}
