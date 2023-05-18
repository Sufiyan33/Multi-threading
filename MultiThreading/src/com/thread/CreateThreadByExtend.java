package com.thread;

public class CreateThreadByExtend extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("user define thread--->");
		}
	}
}
