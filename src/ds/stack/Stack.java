package ds.stack;

public class Stack<T> {

    private int size;
    private T[] stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        stackArray = (T[]) new Object[size];
        top = -1;
    }

    public void push(T t) {
        if (isFull()) {
        	throw new RuntimeException("The stack is full");
        } else {
            top++;
            stackArray[top] = t;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty");
        } else {
            return stackArray[top--];
        }
    }
    
    public T peek() {
    	if (isEmpty()) {
            throw new RuntimeException("The stack is empty");
        } else {
            return stackArray[top];
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size - 1 == top;
    }


}
