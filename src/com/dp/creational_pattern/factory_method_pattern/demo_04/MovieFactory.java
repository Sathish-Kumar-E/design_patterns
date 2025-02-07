package com.dp.creational_pattern.factory_method_pattern.demo_04;

// Creator (Factory)
public abstract class MovieFactory {
	
	public Movie produceMovie(String genre) {
		Movie movie = createMovie(genre);
		movie.produce();
		movie.release();
		return movie;
	}
	
	protected abstract Movie createMovie(String genre);
	
}
