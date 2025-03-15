package com.dp.creational_pattern.factory_method_pattern;

// Abstract Product
interface Vehicle {
	void drive();
}

// Concrete Product
class Car implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a car");
	}
}

// Concrete Product
class Bike implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a Bike");
	}
}

// Creator
abstract class VehicleFactory {
	public abstract Vehicle createVehicle();
}

// Concrete Creator
class CarFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}

// Concrete Creator
class BikeFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}

public class Demo1 {
	public static void main(String[] args) {
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.drive();
		
		VehicleFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.drive();
	}
}
