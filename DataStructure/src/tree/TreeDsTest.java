package tree;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TreeDsTest {

	public static void main(String[] args) {
		MyTree<String> tree = new MyTree<>();
		tree.put("Ram");
		tree.put("Shyam");
		tree.put("Ravi");
		tree.put("kajal");
		tree.put("Suresh");
		tree.put("Raj");
		System.out.println(tree);
	}

}


class MyTree<T> {
	private Node root;
	
	public boolean put(T obj) {
		if (obj == null)
			throw new RuntimeException("Null not allowed.");
		if (root == null) {
			root = new Node(obj);
			return true;
		}
		return add(obj, obj.hashCode(), root);
	}

	private boolean add(T obj, int hash, Node node) {
		if (node.value.hashCode() == hash && node.value.equals(obj)) {
			return false;
		}
		if(node.value.hashCode() > hash) {
			if(node.right == null) {
				node.right = new Node(obj);
				return true;
			}
			add(obj, hash, node.right);
		} else {
			if(node.left == null) {
				node.left = new Node(obj);
				return true;
			}
			add(obj, hash, node.left);
		}
		return false;
	}
	
	@Override
	public String toString() {
		Stack<String> stack = new Stack<String>();
		MyTree tree = new MyTree();
		return super.toString();
	}
	
	public Iterator<T> iterator() {
		Map<String, String> tree = new TreeMap<String, String>();
		tree.values();
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.equals(obj);
	}
	
	private class Node<T> {
		private Node(T obj) {
			this.value = obj;
		}
		private Node left;
		private T value;
		private Node right;
	}
}

