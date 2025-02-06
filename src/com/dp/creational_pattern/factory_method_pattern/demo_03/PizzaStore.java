package com.dp.creational_pattern.factory_method_pattern.demo_03;

// Creator (Factory)
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	// Factory Method - Subclasses will implement this
	protected abstract Pizza createPizza(String type);
	
}
