package com.dp.creational_pattern.factory_method_pattern.demo_04;

public class FactoryMethodPatternDemo {
	public static void main(String[] args) {
		
		MovieFactory hollywoodMovieFactory = new HollywoodMovieFactory();
		MovieFactory bollywoodMovieFactory = new BollywoodMovieFactory();
		
		Movie movie_01 = hollywoodMovieFactory.produceMovie("action");
		System.out.println("Produced " + movie_01.getTitle() + " in Hollowood\n");
		
		Movie movie_02 = bollywoodMovieFactory.produceMovie("comedy");
		System.out.println("Produced " + movie_02.getTitle() + " in Bollywood");
		
	}
}
