package org.jsxm.moviestore;

public class Movie {

	private int movieId;
	
	private boolean available = true;

	public Movie(int movieId) {
		this.movieId = movieId;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setBorrowed() {
		if ( available ) {
			available = false;
		}
		else
			throw new RuntimeException();
	}

	public void release() {
		if (! available ) {
			available = true;
		}
		else
			throw new RuntimeException();
	}
}