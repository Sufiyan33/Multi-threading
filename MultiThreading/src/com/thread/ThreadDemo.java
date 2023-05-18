package com.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		CreateThreadByExtend t = new CreateThreadByExtend();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread --->");
		}
	}
}
