package com.dp.creational_pattern.factory_method_pattern.demo_04;

// Concrete Creator : Hollywood Movie Factory
public class HollywoodMovieFactory extends MovieFactory {

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
