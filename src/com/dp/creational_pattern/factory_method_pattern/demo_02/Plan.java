package com.dp.creational_pattern.factory_method_pattern.demo_02;

public abstract class Plan {
	
	protected double rate;
	
	abstract void setRate();
	
	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
	
}
