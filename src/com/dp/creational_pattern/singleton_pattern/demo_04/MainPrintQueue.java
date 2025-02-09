package com.dp.creational_pattern.singleton_pattern.demo_04;

public class MainPrintQueue {
	public static void main(String[] args) {
		
		PrinterQueueSingleton printerQueue = PrinterQueueSingleton.getInstance();
		printerQueue.addToQueue("Document 1");
		printerQueue.addToQueue("Document 2");
		
		System.out.println("Next document to print : " + printerQueue.getNextDocument());
		System.out.println("Next document to print : " + printerQueue.getNextDocument());
		
	}
}
