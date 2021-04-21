package com.learn;

public class StackUsingLinkedList<T> {
	
	Node<T> top;
	
	public void push(T t) {
		
		Node<T> node = new Node<T>(t);
		
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

class Node<T> {
	
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}
