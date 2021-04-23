package ds.stack;

public class StackUsingLinkedList<T> {
	
	StackNode<T> top;
	
	public void push(T t) {
		
		StackNode<T> node = new StackNode<T>(t);
		
		if (top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
	}
	
	public T pop() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		}
		
		T t = top.data;
		top = top.next;
		
		return t;
	}
	
	public T peek() {
		if (top == null) {
			throw new RuntimeException("Stack Underflow");
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}

class StackNode<T> {
	
	T data;
	StackNode<T> next;
	
	public StackNode(T data) {
		this.data = data;
	}
}
