package com.dp.structural_design_pattern.adapter_pattern;


interface NotificationService {
	public void send(String to, String subject, String body);
}


// Legacy Code : Email Notification Service
class EmailNotificationService implements NotificationService {
	@Override
	public void send(String to, String subject, String body) {
		System.out.println("EmailNotificationService");
		System.out.println("------------------------");
		System.out.println("Sending Email to : " + to);
		System.out.println("Subject : " + subject);
		System.out.println("Body : " + body);
	}
}


class SendGridService {
	public void sendEmail(String recipient, String title, String content) {
		System.out.println("SendGridService");
		System.out.println("---------------");
		System.out.println("Sending Email to : " + recipient);
		System.out.println("Title : " + title);
		System.out.println("Content : " + content);
	}
}


class SendGridAdapter implements NotificationService {
	private SendGridService sendGridService;
	
	public SendGridAdapter(SendGridService sendGridService) {
		this.sendGridService = sendGridService;
	}
	
	// Adapter Method -> Convert parameters and calls to SendGrid Method
	@Override
	public void send(String to, String subject, String body) {
		sendGridService.sendEmail(to, subject, body);
	}
}


public class Demo1 {
	public static void main(String[] args) {
		NotificationService emailNotificationService = new EmailNotificationService();
		emailNotificationService.send("customer@codingminutes.com", "Order Confirmation", "Your order has been received. \n\n");
		
		NotificationService sendGridService = new SendGridAdapter(new SendGridService());
		sendGridService.send("customer@codingminutes.com", "Order Confirmation", "Your order has been received.");
	}
}
