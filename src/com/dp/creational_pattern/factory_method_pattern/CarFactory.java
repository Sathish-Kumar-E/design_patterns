package com.dp.creational_pattern.factory_method_pattern;

// Concrete Factory for Car
public class CarFactory extends VehicleFactory {
	
	@Override
	Vehicle createVehicle() {
		return new Car();
	}
	
}
