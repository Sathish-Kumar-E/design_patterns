package com.dp.creational_pattern.singleton_pattern.demo_02;

public class MainLogger {
	public static void main(String[] args) {
		
		LoggerSingleton logger = LoggerSingleton.getInstance();
		logger.log("Application Started");
		logger.log("User logged in");
		
	}
}
