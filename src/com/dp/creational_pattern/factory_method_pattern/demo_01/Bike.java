package com.dp.creational_pattern.factory_method_pattern.demo_01;

// Concrete Product - Bike
public class Bike implements Vehicle {
	
	@Override
	public void getType() {
		System.out.println("Vehicle Type : Bike");
	}
	
}
