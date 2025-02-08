package com.dp.creational_pattern.singleton_pattern.demo_03;

import java.util.Map;
import java.util.HashMap;

public class SessionCacheSingleton {
	
	private static SessionCacheSingleton instance;
	private Map<String, Object> sessionData;
	
	private SessionCacheSingleton() {
		this.sessionData = new HashMap<>();
	}
	
	public static SessionCacheSingleton getInstance() {
		if(instance == null) {
			instance = new SessionCacheSingleton();
		}
		return instance;
	}
	
	public void addSessionData(String key, Object value) {
		sessionData.put(key, value);
	}
	
	public Object getSessionData(String key) {
		return sessionData.get(key);
	}
	
}
