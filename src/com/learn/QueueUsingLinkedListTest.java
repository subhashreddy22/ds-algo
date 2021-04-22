package com.learn;

public class QueueUsingLinkedListTest {

public static void main(String[] args) {
		
		QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<>();
		
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");
		queue.enqueue("Fourth");
		queue.enqueue("Fifth");
		
		System.out.println(queue.front());
		System.out.println(queue.rear());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		
		queue.enqueue("Sixth");
		
		System.out.println(queue.front());
		System.out.println(queue.rear());
	}
}
