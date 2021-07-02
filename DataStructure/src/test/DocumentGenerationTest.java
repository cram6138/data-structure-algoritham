package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SolutionQ {
	public static class Heading {
		protected int weight;
		protected String text;

		public Heading(int weight, String text) {
			this.weight = weight;
			this.text = text;
		}
	}

	public static class Node {
		protected Heading heading;
		protected List<Node> children;

		public Node(Heading heading) {
			this.heading = heading;
			this.children = new ArrayList<>();
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Heading> headings = new ArrayList<>();
//        for (String line = br.readLine(); line != null; line = br.readLine()) {
//            headings.add(parse(line));
//        }
		// H1 America
		// H2 North America
		// H3 United States
		// H3 Canada
		// H2 South America
		// H3 Brazil
		// H3 Uruguay
		String[] lineArray = { "H1 America", "H2 North America", "H3 United States", "H3 Canada", "H2 South America",
				"H3 Brazil", "H3 Uruguay" };
		for (String line : lineArray) {
			headings.add(parse(line));
		}
		Node outline = toOutline(headings);
		String html = toHtml(outline);
		System.out.println(html);
	}

	/////////// BEGIN EDITABLE //////////////
	private static Node toOutline(List<Heading> headings) {
		// Implement this function. Sample code below builds an
		// outline of only the first heading.
		Node root = new Node(new Heading(0, ""));
		root.children.add(new Node(headings.get(0)));
		return root;
	}

	/////////// END EDITABLE //////////////
	// <ul>
//	<li>America
//		<ul>North America   <li>United States</li> 		<li>Canada</li>	</ul>
// 		<ul>South America	<li>United States</li>		<li>Canada</li>	</ul>
//    <li>
//</ul>    	
	// H1 America
	// H2 North America
	// H3 United States
	// H3 Canada
	// H2 South America
	// H3 Brazil
	// H3 Uruguay
	/**
	 * Parses a line of input. This implementation is correct for all predefined
	 * test cases.
	 */
	private static Heading parse(String record) {
		String[] parts = record.split(" ", 2);
		int weight = Integer.parseInt(parts[0].substring(1));
		Heading heading = new Heading(weight, parts[1].trim());
		return heading;
	}

	/**
	 * Converts a node to HTML. This implementation is correct for all predefined
	 * test cases.
	 */
	private static String toHtml(Node node) {
		StringBuilder buf = new StringBuilder();
		if (!node.heading.text.isEmpty()) {
			buf.append(node.heading.text);
			buf.append("\n");
		}
		Iterator<Node> iter = node.children.iterator();
		if (iter.hasNext()) {
			buf.append("<ul>");

			while (iter.hasNext()) {
				Node child = iter.next();
				buf.append("<li>");
				buf.append(toHtml(child));
				buf.append("</li>");
				if (iter.hasNext()) {
					buf.append("\n");
				}
			}
			buf.append("</ul>");
		}
		return buf.toString();
	}
}

//else {
//List<Heading> headingq=new ArrayList<Heading>(headings.size()-1);
//for(int i=2;i<headings.size();i++) {
//	Heading newHeading=headings.get(i);
//	headingq.add(newHeading);
//}
//
//   }
