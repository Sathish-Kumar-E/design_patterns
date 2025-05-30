package com.dp.creational_design_pattern.factory_pattern;

interface Transport {
	public void deliver();
}

// Concrete Class
class Car implements Transport {
	@Override
	public void deliver() {
		System.out.println("Deliver by Car");
	}
}

// Concrete Class
class Bike implements Transport {
	@Override
	public void deliver() {
		System.out.println("Deliver by Bike");	
	}
}

// Concrete Class
class Bus implements Transport {
	@Override
	public void deliver() {
		System.out.println("Deliver by Bus");	
	}
}

class TransportFactory {
	public static Transport createTransport(String type) {
		switch(type.toLowerCase()) {
		case "car"  : return new Car();
		case "bike" : return new Bike();
		case "bus"  : return new Bus();
		default		: throw new IllegalArgumentException("Unsupported Transport Type");
		}
	}
}

// Client Code : TransportService
public class Demo1 {
	public static void main(String[] args) {
		Transport vehicle = TransportFactory.createTransport("bus");
		vehicle.deliver();
		// Here, we are not explicitly creating objects on the client code
		// On runtime, parameter can change, and we can get that type of vehicle
		// It follows the Open/Close Principle without modifying the client code
		// It has Loose Coupling, we can add new type of vehicles without modifying the client code
	}
}

