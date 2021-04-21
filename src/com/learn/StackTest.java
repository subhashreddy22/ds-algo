package com.learn;

public class StackTest {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(5);
		
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
		
		try {
			stack.push("Sixth");
		} catch (Exception ex) {
			System.out.println(ex instanceof RuntimeException);
		}
		
		
		System.out.println(stack.peek());
	}
}
