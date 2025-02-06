package com.dp.creational_pattern.factory_method_pattern.demo_03;

// Abstract Product
public abstract class Pizza {
	
	protected String name;
	
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	
	public void bake() {
		System.out.println("Baking " + name);
	}
	
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	public void box() {
		System.out.println("Boxing " + name);
	}
	
	public String getName() {
		return name;
	}
	
}
