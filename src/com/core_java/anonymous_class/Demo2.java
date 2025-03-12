package com.core_java.anonymous_class;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		
		// Create an anonymous class that extends Animal
		Animal dog = new Animal() {
			@Override
			void makeSound() {
				System.out.println("Dog barks");
			}
		};
		dog.makeSound();
	}
}
