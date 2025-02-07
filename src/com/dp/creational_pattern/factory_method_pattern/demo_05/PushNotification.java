package com.dp.creational_pattern.factory_method_pattern.demo_05;

// Concrete Product : Push Notification
public class PushNotification extends Notification {
	
	@Override
	public void notifyUser() {
		System.out.println("Sending a Push Notification");
	}
	
}
