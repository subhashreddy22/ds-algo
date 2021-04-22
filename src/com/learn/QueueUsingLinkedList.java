package com.learn;

public class QueueUsingLinkedList<T> {
	
	QueueNode<T> front;
	QueueNode<T> rear;
	
	public void enqueue(T t) {
		QueueNode<T> node = new QueueNode<T>(t);
		if (rear == null) {
			this.front = this.rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}
	
	public T dequeue() {
		if (front == null) {
			throw new RuntimeException("Queue is empty");
		}
		
		QueueNode<T> frontNode = front;
		front = front.next;
		
		if (front == null) {
			rear = null;
		}
		
		return frontNode.t;
	}
	
	public T front() {
		if (front == null) {
			throw new RuntimeException("Queue is empty");
		}
		return front.t;
	}
	
	public T rear() {
		if (rear == null) {
			throw new RuntimeException("Queue is empty");
		}
		return rear.t;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
}

class QueueNode<T> {
	
	T t;
	QueueNode<T> next;
	
	public QueueNode(T t) {
		this.t = t;
	}
}
