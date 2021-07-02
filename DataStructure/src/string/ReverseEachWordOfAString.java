package string;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		String st = "Bhajuram Chaurasiya";
		String newSentance = "";
		String[] wordList = st.split(" ");
		wordList = reverseEachWord(wordList);
		newSentance = String.join(" ", wordList);
		System.out.println("before :::: " + st);
		System.out.println("after :::: " + newSentance);
	}

	private static String[] reverseEachWord(String[] wordList) {
		for(int i = 0; i < wordList.length; i++) {
			wordList[i] = reverseWord("", wordList[i]);
		}
		return wordList;
	}

	private static String reverseWord(String newString, String st) {
		if(st.length() == 0) {
			return newString;
		}
		newString =  st.charAt(0) + newString;
		return reverseWord(newString, st.substring(1));
	}

}
