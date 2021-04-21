package com.learn;

class StackUsingLinkedListTest {

	public static void main(String[] args) {
		
		StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		System.out.println(stack.peek());
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		stack.push("Sixth");
		
		System.out.println(stack.peek());
	}
}
