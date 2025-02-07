package com.dp.creational_pattern.factory_method_pattern.demo_05;

// Concrete Creator : Standard Notification Factory
public class StandardNotificationFactory extends NotificationFactory {
	
	@Override
	protected Notification getNotification(String type) {
		if(type.equalsIgnoreCase("email")) {
			return new EmailNotification();
		} else if(type.equalsIgnoreCase("sms")) {
			return new SMSNotification();
		} else if(type.equalsIgnoreCase("push")) {
			return new PushNotification();
		} else {
			return null;
		}
	}
	
}
