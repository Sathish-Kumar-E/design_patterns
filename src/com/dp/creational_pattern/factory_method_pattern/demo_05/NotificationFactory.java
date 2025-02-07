package com.dp.creational_pattern.factory_method_pattern.demo_05;

// Creator (Factory)
public abstract class NotificationFactory {
	
	public Notification createNotification(String type) {
		Notification notification = getNotification(type);
		return notification;
	}
	
	// Factory Method - Subclasses will implement this
	protected abstract Notification getNotification(String type);
	
}
