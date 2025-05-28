package com.dp.structural_design_pattern.facade_pattern;


// Microservice for User Management
class UserService {
	public String getUserDetails(String userId) {
		// Simulate fetching user details
		return "User details for User Id : " + userId;
	}
}


// Microservice for Order Management
class OrderService {
	public String getOrderDetails(String orderId) {
		// Simulate fetching order details
		return "Order detals for Order Id : " + orderId;
	}
}


// Microservice for Payment Processing
class PaymentService {
	public String processPayment(String paymentId) {
		// Simulate payment processing
		return "Processing payment with Payment Id : " + paymentId;
	}
}


class APIGateway {
	UserService userService;
	OrderService orderService;
	PaymentService paymentService;
	
	public APIGateway() {
		this.userService = new UserService();
		this.orderService = new OrderService();
		this.paymentService = new PaymentService();
	}
	
	// Task
	public String getFullOrderDetails(String userId, String orderId, String paymentId) {
		String userDetails = userService.getUserDetails(userId);
		String orderDetails = orderService.getOrderDetails(orderId);
		String paymentDetails = paymentService.processPayment(paymentId);
		return userDetails + "\n" + orderDetails + "\n" + paymentDetails;
	}
}


public class Demo1 {
	public static void main(String[] args) {
		// Client code interacting with API Gateway (Facade)
		APIGateway apiGateway = new APIGateway();
		// Task
		System.out.println(apiGateway.getFullOrderDetails("123", "456", "789"));
	}
}

