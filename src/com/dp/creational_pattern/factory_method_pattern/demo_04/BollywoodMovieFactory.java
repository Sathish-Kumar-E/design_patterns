package com.dp.creational_pattern.factory_method_pattern.demo_04;

// Concrete Creater : Bollywood Movie Factory
public class BollywoodMovieFactory extends MovieFactory {

	@Override
	protected Movie createMovie(String genre) {
		if(genre.equalsIgnoreCase("action")) {
			return new ActionMovie();
		} else if(genre.equalsIgnoreCase("comedy")) {
			return new ComedyMovie();
		} else if(genre.equalsIgnoreCase("horror")) {
			return new HorrorMovie();
		} else {
			return null;
		}
	}
	
}
