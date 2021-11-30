package com.bl;

import java.util.LinkedList;

public class Stacks {
	LinkedList<Integer> list = new LinkedList<>();

	public void insert(int data) {
		list.addFirst(data);
	}

	public void display() {
		System.out.println("Elements in Link list");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
