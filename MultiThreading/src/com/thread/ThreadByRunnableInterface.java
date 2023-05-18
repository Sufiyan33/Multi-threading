package com.thread;

public class ThreadByRunnableInterface implements Runnable {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();
		System.out.println("is thread alive :: " + t.isAlive());
		System.out.println("thread id :: " + t.getId());
		System.out.println("thread name ::  " + t.getName());
		System.out.println("runnig main thread");
		System.out.println(Thread.currentThread().getName());
		t.run();
	}

	@Override
	public void run() {
		System.out.println("call run method");

	}
}
