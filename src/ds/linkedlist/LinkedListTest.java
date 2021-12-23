package ds.linkedlist;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(34);
		linkedList.insert(23);
		linkedList.insert(99);
		
		linkedList.print();
		
		linkedList.insertAtFirst(3);
		linkedList.print();
		
		linkedList.insertAt(1, 5);
		linkedList.print();
		
		linkedList.insertAt(5, 26);
		linkedList.print();
		
		linkedList.delete(2);
		linkedList.print();
		System.out.println("Before reversing");
		linkedList.print();
		linkedList.insert(34);
		linkedList.recursiveReverse();
		linkedList.print();
	}
}
