package com.dp.creational_pattern.factory_method_pattern;

// Concrete Factory for Bike
public class BikeFactory extends VehicleFactory {
	
	@Override
	Vehicle createVehicle() {
		return new Bike();
	}
	
}
