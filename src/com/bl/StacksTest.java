package com.bl;

public class StacksTest {
	public static void main(String[] args) {
		Stacks stack = new Stacks();
		stack.insert(70);
		stack.insert(30);
		stack.insert(56);
		stack.display();
		stack.peak();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
