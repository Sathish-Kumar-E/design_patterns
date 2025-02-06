package com.dp.creational_pattern.factory_method_pattern;

public class FactoryMethodPatternDemo {
	public static void main(String[] args) {
		
		// Creating a Car using CarFactory
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.getType();
		
		// Creating a Bike using BikeFactory
		VehicleFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.getType();
		
	}
}
