package com.learn;

public class Queue<T> {
	
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private T[] queue;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.queue = (T[]) new Object[capacity];
		this.front = 0;
		this.rear = capacity - 1;
		this.size = 0;
	}
	
	public void enqueue(T t) {
		if (isFull()) {
			throw new RuntimeException("Queue is full");
		}
		rear = (rear + 1) % capacity;
		queue[rear] = t;
		size++;
	}
	
	public T dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		T t = queue[front];
		front = (front + 1) % capacity;
		size--;
		
		return t;
	}
	
	public T front() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return queue[front];
	}
	
	public T rear() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return queue[rear];
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
