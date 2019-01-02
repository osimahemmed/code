package come.sape.stack.impl;

import java.util.EmptyStackException;

public class StackUsingArray {
	
	private int[] arr;
	private int size;
	private int index;
	
	public StackUsingArray(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void push(int element) {
		if(isFull()) {
			throw new StackOverflowError("Stack is full");
		}
		
		arr[index] = element;
		index ++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return arr[--index];
	}
	
	public boolean isFull() {
		if(index == size) {
			return true;
		}
		return false;
	}
	public int size() {
		return index;
	}
	
	public boolean isEmpty() {
		if(index == 0) {
			return true;
		}
		return false;
	}

}
