package com.core_java.anonymous_class;

public class Demo1 {
	public static void main(String[] args) {
		
		// Create an anonymous class that implements Runnable
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("This is an anonymous class running!");
			}
		};
		// Start the thread with the anonymous class
		new Thread(myRunnable).start();
		
	}
}
