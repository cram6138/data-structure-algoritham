package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateFromArrayList {

	//maintain the insertion order
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JAVA");
		list.add("Servlet");
		list.add("JDBC");
		list.add("core");
		list.add("Advance");
		list.add("Angular");
		list.add("Angular");
		list.add("JAVA");
		
		LinkedHashSet<String> linkedList = new LinkedHashSet<String>(list);
		list = new ArrayList<String>(linkedList);
		System.out.println(list);
	}

}
