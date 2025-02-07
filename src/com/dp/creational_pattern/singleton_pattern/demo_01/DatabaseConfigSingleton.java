package com.dp.creational_pattern.singleton_pattern.demo_01;

public class DatabaseConfigSingleton {
	
	private static DatabaseConfigSingleton instance;
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;
	
	private DatabaseConfigSingleton() {
		this.dbUrl = "jdbc:mysql://localhost:3306/mydb";
		this.dbUsername = "username";
		this.dbPassword = "password";
	}
	
	public static DatabaseConfigSingleton getInstance() {
		if(instance == null) {
			instance = new DatabaseConfigSingleton();
		}
		return instance;
	}
	
	public String getDbUrl() {
		return dbUrl;
	}
	
	public String getDbUsername() {
		return dbUsername;
	}
	
	public String getDbPassword() {
		return dbPassword;
	}
	
}
