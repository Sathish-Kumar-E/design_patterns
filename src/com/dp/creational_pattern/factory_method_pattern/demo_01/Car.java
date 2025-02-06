package com.dp.creational_pattern.factory_method_pattern.demo_01;

// Concrete Product - Car
public class Car implements Vehicle {
	
	@Override
	public void getType() {
		System.out.println("Vehicle Type : Car");
	}
	
}
