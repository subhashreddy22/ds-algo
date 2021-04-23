package com.learn;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
	
	Stack<T> s1, s2;
	
	public QueueUsingTwoStacks() { 
		s1 = new Stack<>();        
		s2 = new Stack<>();
	}
	
	public void enqueue(T t) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(t);
		
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public T dequeue() {
		if (s1.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		return s1.pop();
	}
	
	public T peek() {
		if (s1.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		return s1.peek();
	}
	
	public boolean isEmpty() {
		return s1.isEmpty();
	}
}
