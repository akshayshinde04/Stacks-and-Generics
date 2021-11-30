package com.bl;

import java.util.LinkedList;

public class Queues {
	LinkedList<Integer> queue = new LinkedList<>();

	public void insert(int data) {
		queue.addLast(data);     //inserting queues values
	}

	public void display() {
		System.out.println("Elements in Link list");
		for (Integer integer : queue) {        // Display queues values
			System.out.println(integer);
		}
	}

	public void peak() {
		System.out.println("Peak Element :" + queue.peek()); // peak no
	}

	public void pop() {    // pop no
		if (queue.size() != 0) {
			queue.pop();
		} else {
			System.out.println("Stack is Empty");
		}
	}
}