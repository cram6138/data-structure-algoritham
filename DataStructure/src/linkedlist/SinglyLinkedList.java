package linkedlist;

public class SinglyLinkedList {

	Node head;
	
	public boolean add(Object val) {
		Node node = new Node(val);
		if(head == null) {
			head = node;
			return true;
		}
		tailNode().next = node;
		return true;
	}
	
	public boolean find(Object val) {
		Node node = head;
		do {
			if(node.value == val) {
				return true;
			}
			node = node.next;
		} while(node.next != null);
		
		return false;
	}
	
	public boolean findRecursive(Object val) {
		if(head == null)
			return false;
		return findElement(head, val);
	}
	
	private boolean findElement(Node node, Object key) {
		if(node == null)
			return false;
		
		if(node.value == key)
			return true;
		return findElement(node.next, key);
	}

	public Object getNthElement(int n) {
		Node node = head;
		while(n > 0) {
			node = node.next;
			n--;
		}
		return node.value;
	}
	
	public int indexOf(Object obj) {
		Node node = head;
		int index = 0;
		
		if(head == null)
			return -1;
		
		do {
			if(node.value == obj) {
				return index;
			}
			node = node.next;
			index++;
		} while(node.next != null);
		
		return -1;
	}
	
	public void deleteByKey(Object key) {
		Node node = head, prev = null;
		if(head != null && head.value == key) {
			head = null;
			return;
		}
		
		while(node != null && node.next != null) {
			prev = node;
			node = node.next;
			if(node.value == key) {
				prev.next = node.next;
				return;
			}
		}
	}
	
	public void reverseList() {
		if(head == null)
			return;
		
 		Node prev = head;
 		head = prev.next;
 		prev.next = null;
 		Node nextE = head.next;
 		head.next = prev;
 		
		while(nextE != null) {
			prev = head;
			head = nextE;
			nextE = head.next;
	 		head.next = prev;
		}
	}
	
	public int length() {
		if(head == null)
			return 0;
		return size(head);
	}
	
	private int size(Node node) {
		if(node == null)
			return 0;
		return 1+size(node.next);
	}

	public void printLinkedList() {
		Node node = head;
		while(node != null) {
			System.out.print(node.value + " ");
			node = node.next;
		}
	}
	
	public void printMiddleOfLinkedList() {
		int length = length();
		if(length%2 == 0) {
			//middle would be length/2 - 1 and length/2
			System.out.println(getNthElement(length/2 - 1) + " " + getNthElement(length/2));
		} else {
			//middle would be length/2
			System.out.println(getNthElement(length/2));
		}
	}
	
	private Node tailNode() {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		return node;
	}

	class Node {
		Object value;
		Node next;

		public Node(Object value) {
			this.value = value;
		}
	}

}
