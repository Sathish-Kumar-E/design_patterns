package com.dp.creational_pattern.factory_method_pattern;

// Abstract Product
interface Shape {
	public void draw();
}

// Concrete Product
class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

// Concrete Product
class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

// Concrete Product
class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

// Creator with a Factory Method
abstract class ShapeFactory {
	public abstract Shape createShape(String shapeType);
}

// Concrete Creator
class ConcreteShapeFactory extends ShapeFactory {
	@Override
	public Shape createShape(String shapeType) {
		if(shapeType == null) {
			return null;
		} else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		} else {
			return null;
		}
	}
}


public class Demo2 {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape circle = shapeFactory.createShape("CIRCLE");
		circle.draw();
		
		Shape square = shapeFactory.createShape("SQUARE");
		square.draw();
		
		Shape triangle = shapeFactory.createShape("TRIANGLE");
		triangle.draw();
	}
}
