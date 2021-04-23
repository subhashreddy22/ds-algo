package com.learn;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues<T> {
	
	Queue<T> q1, q2;
	
	public StackUsingTwoQueues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public void push(T t) {
		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		
		q1.add(t);
		
		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	
	public T pop() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		
		return q1.poll();
	}
	
	public T peek() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		
		return q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}
