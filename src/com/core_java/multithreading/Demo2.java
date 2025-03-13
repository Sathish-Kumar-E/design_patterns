package com.core_java.multithreading;

class Red implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Red");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Blue implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Blue");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Runnable red = new Red();
		Runnable blue = new Blue();
		Thread t1 = new Thread(red);
		Thread t2 = new Thread(blue);
		t1.start();
		try {
			Thread.sleep(10);
		} catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
	}
}
