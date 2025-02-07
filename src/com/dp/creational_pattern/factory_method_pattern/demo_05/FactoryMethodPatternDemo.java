package com.dp.creational_pattern.factory_method_pattern.demo_05;

public class FactoryMethodPatternDemo {
	public static void main(String[] args) {
		
		System.out.println("Standard Notification");
		System.out.println("---------------------");
		
		NotificationFactory standardNotificationFactory = new StandardNotificationFactory();
		Notification email_1 = standardNotificationFactory.createNotification("email");
		email_1.notifyUser();
		Notification sms_1 = standardNotificationFactory.createNotification("sms");
		sms_1.notifyUser();
		Notification push_1 = standardNotificationFactory.createNotification("push");
		push_1.notifyUser();
		
		System.out.println("\nSecure Notification");
		System.out.println("-------------------");
		
		NotificationFactory secureNotificationFactory = new SecureNotificationFactory();
		Notification email_2 = secureNotificationFactory.createNotification("email");
		email_2.notifyUser();
		Notification sms_2 = secureNotificationFactory.createNotification("sms");
		sms_2.notifyUser();
		Notification push_2 = secureNotificationFactory.createNotification("push");
		push_2.notifyUser();
		
	}
}
