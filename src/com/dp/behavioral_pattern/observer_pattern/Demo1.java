package com.dp.behavioral_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
	void update(float temp);
}

// Subject Interface
interface Subject {
	void attach(Observer obs);
	void detach(Observer obs);
	void notifyObservers();
}

// Weather Station
class WeatherStation implements Subject {
	private float temperature;
	private List<Observer> observerList;
	
	WeatherStation() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void attach(Observer obs) {
		observerList.add(obs);
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	
	@Override
	public void detach(Observer obs) {
		observerList.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observerList) {
			obs.update(temperature); // Run Time Polymorphism
		}
	}
}


class DisplayDevice implements Observer {
	String deviceName;
	
	public DisplayDevice(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Override
	public void update(float temp) {
		System.out.println("Temperature on " + deviceName + " is : " + temp);
	}
}


class MobileDevice implements Observer {
	String deviceName;
	
	public MobileDevice(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Override
	public void update(float temp) {
		System.out.println("Temperature on " + deviceName + " is : " + temp);
	}
}


public class Demo1 {
	public static void main(String[] args) {
		// Create a Publisher
		WeatherStation weatherStation = new WeatherStation();
		
		// Create Subscribers
		DisplayDevice displayDevice = new DisplayDevice("Samsung LCD");
		MobileDevice mobileDevice = new MobileDevice("iPhone 13");
		
		// Attach
		weatherStation.attach(displayDevice);
		weatherStation.attach(mobileDevice);
		
		// Set Temperature
		weatherStation.setTemperature(28);
		System.out.println();
		weatherStation.setTemperature(26);
		System.out.println();
		
		// Detach
		weatherStation.detach(mobileDevice);
		
		// Set Temperature
		weatherStation.setTemperature(31);
	}
}
