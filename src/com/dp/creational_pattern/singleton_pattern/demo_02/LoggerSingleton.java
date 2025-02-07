package com.dp.creational_pattern.singleton_pattern.demo_02;

public class LoggerSingleton {
	
	private static LoggerSingleton instance;
	private String logFile;
	
	private LoggerSingleton() {
		this.logFile = "app.log";
	}
	
	public static LoggerSingleton getInstance() {
		if(instance == null) {
			instance = new LoggerSingleton();
		}
		return instance;
	}
	
	public void log(String message) {
		System.out.println("Logging to " + logFile + " : " + message);
	}
	
}
