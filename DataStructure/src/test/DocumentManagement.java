package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DocumentManagement {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("H1 America");
		stringList.add("H2 North America");
		stringList.add("H3 United States");
		stringList.add("H3 Canada");
		stringList.add("H2 South America");
		stringList.add("H3 Brazil");
		stringList.add("H3 Uruguay");
		stringList.add("H1 America");
		stringList.add("H2 North America");
		stringList.add("H3 United States");
		stringList.add("H3 Canada");
		stringList.add("H2 South America");
		stringList.add("H3 Brazil");
		stringList.add("H3 Uruguay");

		stringList.add("H1 India");
		stringList.add("H2 Hyderabad");
		stringList.add("H3 Delhi");
		stringList.add("H3 Gujrat");
		stringList.add("H2 Bengaluru");
		stringList.add("H3 Chennai");
		stringList.add("H3 Punjab");

		Queue<String> stringQueue = new LinkedList<String>(stringList);

		String formedString = htmlFormatedString(stringQueue);

		System.out.println(formedString);
	}

	private static String finalString = "";

	private static String htmlFormatedString(Queue<String> stringQueue) {
		while (!stringQueue.isEmpty()) {
			finalString += getUlString(stringQueue);
		}
		return finalString;
	}

	private static int currentUl;

	private static String getUlString(Queue<String> stringQueue) {
		String st = "<ul>" + getLiString(stringQueue.poll(), stringQueue) + "</ul>";
		if (!stringQueue.isEmpty() && currentUl > Integer.parseInt(stringQueue.peek().substring(1, 2))) {
			String ul = getClosingUl(currentUl - Integer.parseInt(stringQueue.peek().substring(1, 2)));
			return st + ul + getUlString(stringQueue);
		}
		return st;
	}

	private static String getClosingUl(int i) {
		String st = "";
		while (i > 0) {
			st += "</ul>";
			i--;
		}
		return st;
	}

	private static String getLiString(String item, Queue<String> stringQueue) {
		currentUl = Integer.parseInt(item.substring(1, 2));
		String finalString = "<li>" + item.substring(3) + "</li>";
		if (stringQueue.size() < 1) {
			return finalString;
		}
		while (!stringQueue.isEmpty() && item.substring(0, 2).equals(stringQueue.peek().substring(0, 2))) {
			finalString += "<li>" + stringQueue.poll().substring(3) + "</li>";
		}

		return !stringQueue.isEmpty() && currentUl < Integer.parseInt(stringQueue.peek().substring(1, 2))
				? finalString + getUlString(stringQueue)
				: finalString;
	}

}
