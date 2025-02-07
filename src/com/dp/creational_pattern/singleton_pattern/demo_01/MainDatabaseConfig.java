package com.dp.creational_pattern.singleton_pattern.demo_01;

public class MainDatabaseConfig {
	public static void main(String[] args) {
		
		DatabaseConfigSingleton config = DatabaseConfigSingleton.getInstance();
		System.out.println("Database URL : " + config.getDbUrl());
		System.out.println("Database Username : " + config.getDbUsername());
		System.out.println("Database Password : " + config.getDbPassword());
		
	}
}
