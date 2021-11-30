package com.bl;
import java.util.LinkedList;
public class Queues {
	LinkedList<Integer> queue = new LinkedList<>();
	public void insert(int data) {
		queue.addLast(data);
	}
	public void display() {
		System.out.println("Elements in Link list");
		for (Integer integer : queue) {
			System.out.println(integer);
		}		
	}
}
