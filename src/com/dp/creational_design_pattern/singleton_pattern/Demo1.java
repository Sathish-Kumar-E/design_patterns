package com.dp.creational_design_pattern.singleton_pattern;


class AppSettings {
	// Step 1 : Private static instance of the class
	private static AppSettings instance;
	
	private String databaseUrl;
	private String apiKey;
	
	// Step 2 : Private constructor to prevent direct object creation
	private AppSettings() {
		this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
		this.apiKey = "12345-ABCDE";
	}
	
	// Step 3 : Public static method to get the single instance
	public static AppSettings getInstance() {
		if(instance == null) {
			instance = new AppSettings();
		}
		return instance;
	}
	
	public String getDatabaseUrl() {
		return this.databaseUrl;
	}
	
	public String getApiKey() {
		return this.apiKey;
	}
}


public class Demo1 {
	public static void main(String[] args) {
		AppSettings appSettings = AppSettings.getInstance();
		AppSettings appSettingsCopy = AppSettings.getInstance();
		System.out.println(appSettings.getApiKey());
		System.out.println(appSettingsCopy.getApiKey());
		System.out.println(appSettings == appSettingsCopy);
	}
}

