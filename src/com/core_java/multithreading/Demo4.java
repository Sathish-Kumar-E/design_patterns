package com.core_java.multithreading;

class Counter {
	int count;
	
	public synchronized void increment() {
		count++;
	}
}

public class Demo4 {	
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
									@Override
									public void run() {
										for(int i = 1 ; i <= 1000 ; i++) {
											c.increment();
										}
									}
		});
		
		Thread t2 = new Thread(new Runnable() {
									@Override
									public void run() {
										for(int i = 1 ; i <= 1000 ; i++) {
											c.increment();
										}
									}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		
		System.out.println("Count : " + c.count);
		
	}
}
