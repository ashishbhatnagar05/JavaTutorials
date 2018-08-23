package com.multithreading.oldway;

class Printer {

	public void print() {
		System.out.println("thread: " + Thread.currentThread().getName());
		System.out.println("Object: " + this);
	}

	public int getValue() {
		System.out.println("thread: " + Thread.currentThread().getName());
		System.out.println("Object: " + this);
		return 5;
	}
}