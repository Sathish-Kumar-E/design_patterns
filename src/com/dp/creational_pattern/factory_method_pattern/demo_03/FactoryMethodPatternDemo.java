package com.dp.creational_pattern.factory_method_pattern.demo_03;

public class FactoryMethodPatternDemo {
	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza_01 = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ordered a " + pizza_01.getName() + " from New York Store\n");
		
		Pizza pizza_02 = chicagoPizzaStore.orderPizza("pepperoni");
		System.out.println("Ordered a " + pizza_02.getName() + " from Chicago Store\n");
		
	}
}
