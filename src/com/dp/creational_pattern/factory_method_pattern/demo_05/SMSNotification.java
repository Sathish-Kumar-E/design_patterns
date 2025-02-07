package com.dp.creational_pattern.factory_method_pattern.demo_05;

// Concrete Class : SMS Notification
public class SMSNotification extends Notification {
	
	@Override
	public void notifyUser() {
		System.out.println("Sending a SMS Notification");
	}
	
}
