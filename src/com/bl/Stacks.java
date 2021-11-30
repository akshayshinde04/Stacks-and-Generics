package com.bl;

import java.util.LinkedList;

public class Stacks {
	LinkedList<Integer> list = new LinkedList<>();

	public void insert(int data) { // inserting value
		list.addFirst(data);
	}

	public void display() { // Displaying inserted value
		System.out.println("Elements in Link list");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public void peak() {
		System.out.println("Peak Element :" + list.peek()); // peak no
	}

	public void pop() { // pop no
		if (list.size() != 0) {
			list.pop();
		} else {
			System.out.println("Stack is Empty");
		}
	}
}
