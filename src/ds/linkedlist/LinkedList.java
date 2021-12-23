package ds.linkedlist;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void insertAt(int index, int data) {
		if (index == 0) {
			this.insertAtFirst(data);
		} else {
			Node node = new Node();
			node.data = data;
			Node n = head;
			for (int i = 1; i < index; i++) {
				if (n != null) {
					n = n.next;
				}
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void delete(int index) {
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		n.next = n.next.next;
	}

	public void print() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data);
		System.out.println();
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void recursiveReverse() {
		recursiveReverse(head, null);
	}
	
	public void recursiveReverse(Node current, Node prev) {
		if (current.next == null) {
			head = current;
			current.next = prev;
			return;
		} else {
			Node next = current.next;
			current.next = prev;
			recursiveReverse(next, current);
		}
	}
}
