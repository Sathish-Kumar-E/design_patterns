package com.dp.creational_pattern.factory_method_pattern.demo_05;

// Concrete Product : Email Notification
public class EmailNotification extends Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an Email Notification");
	}
	
};
