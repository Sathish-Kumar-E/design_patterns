package com.dp.creational_pattern.singleton_pattern.demo_03;

public class MainSessionCache {
	public static void main(String[] args) {
		
		SessionCacheSingleton cache = SessionCacheSingleton.getInstance();
		cache.addSessionData("userId", 123);
		cache.addSessionData("username", "john_doe");
		
		System.out.println("User ID : " + cache.getSessionData("userId"));
		System.out.println("Username : " + cache.getSessionData("username"));
		
	}
}
