package string;

public class CapitalizeFirstLatterOfEachWordOfAString {

	public static void main(String[] args) {
		String st = "bhajuram chaurasiya";
		String newSentance = "";
		String[] wordList = st.split(" ");
		wordList = capitalizeFirstLetterOfEachWord(wordList);
		newSentance = String.join(" ", wordList);
		System.out.println("before :::: " + st);
		System.out.println("after :::: " + newSentance);
	}

	private static String[] capitalizeFirstLetterOfEachWord(String[] wordList) {
		for(int i = 0; i < wordList.length; i++) {
			wordList[i] = wordList[i].substring(0, 1).toUpperCase() + wordList[i].substring(1);
		}
		return wordList;
	}

}
