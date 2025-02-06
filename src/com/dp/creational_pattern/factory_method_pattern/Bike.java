package com.dp.creational_pattern.factory_method_pattern;

// Concrete Product - Bike
public class Bike implements Vehicle {
	
	@Override
	public void getType() {
		System.out.println("Vehicle Type : Bike");
	}
	
}
