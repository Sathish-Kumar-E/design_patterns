package com.dp.creational_pattern.factory_method_pattern.demo_03;

// Concrete Creator : New York Style Pizza Store
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new CheesePizza();
		} else if(type.equals("pepperoni")) {
			return new PepperoniPizza();
		} else if(type.equals("veggie")) {
			return new VeggiePizza();
		} else {
			return null;
		}
	}
	
}
