package com.dp.creational_pattern.singleton_pattern.demo_04;
	
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueueSingleton {
	
	private static PrinterQueueSingleton instance;
	private Queue<String> printQueue;
	
	public PrinterQueueSingleton() {
		this.printQueue = new LinkedList<>();
	}
	
	public static PrinterQueueSingleton getInstance() {
		if(instance == null) {
			instance = new PrinterQueueSingleton();
		}
		return instance;
	}
	
	public void addToQueue(String document) {
		printQueue.add(document);
	}
	
	public String getNextDocument() {
		return printQueue.poll();
	}
}
