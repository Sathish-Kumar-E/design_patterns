package com.dp.creational_pattern.factory_method_pattern.demo_04;

// Abstract Product
public abstract class Movie {
	
	protected String title;
	
	public void produce() {
		System.out.println("Producing " + title);
	}
	
	public void release() {
		System.out.println("Releasing " + title);
	}
	
	public String getTitle() {
		return title;
	}
	
}
