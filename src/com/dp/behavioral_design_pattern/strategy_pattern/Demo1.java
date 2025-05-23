package com.dp.behavioral_design_pattern.strategy_pattern;


// Strategy
interface PaymentStrategy{
	void processPayment();
}


// Concrete Strategy : For credit card payment
class CreditCardPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Making payment via Credit Card");
	}
}


// Concrete Strategy : For debit card payment
class DebitCardPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Making payment via Debit Card");	
	}
}


// Concrete Strategy : For UPI payment
class UPIPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Making payment via UPI");
	}
}


class PaymentService{
	private PaymentStrategy strategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void pay() {
		strategy.processPayment();
	}
}


public class Demo1 {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		paymentService.setPaymentStrategy(new CreditCardPayment());
		paymentService.pay();
	}
}
