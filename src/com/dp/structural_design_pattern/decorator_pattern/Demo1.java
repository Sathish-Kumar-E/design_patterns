package com.dp.structural_design_pattern.decorator_pattern;


interface Pizza {
	public String getDescription();
	public double getCost();
}


class BasicPizza implements Pizza {
	@Override
	public String getDescription() {
		return "Basic Pizza";
	}
	
	@Override
	public double getCost() {
		return 5.00; // Base Cost
	}
}


abstract class PizzaDecorator implements Pizza {
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.decoratedPizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return decoratedPizza.getDescription();
	}
	
	@Override
	public double getCost() {
		return decoratedPizza.getCost();
	}
}


class CheeseDecorator extends PizzaDecorator {
	public CheeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Cheese";
	}
	
	public double getCost() {
		return decoratedPizza.getCost() + 1.00;
	}
}

class OliveDecorator extends PizzaDecorator {
	public OliveDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Olive";
	}
	
	public double getCost() {
		return decoratedPizza.getCost() + 0.50;
	}
}


class MushroomDecorator extends PizzaDecorator {
	public MushroomDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Mushroom";
	}
	
	public double getCost() {
		return decoratedPizza.getCost() + 2.00;
	}
}


public class Demo1 {
	public static void main(String[] args) {
		Pizza pizza = new BasicPizza();
		pizza = new CheeseDecorator(pizza);
		pizza = new OliveDecorator(pizza);
		pizza = new MushroomDecorator(pizza);
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}

