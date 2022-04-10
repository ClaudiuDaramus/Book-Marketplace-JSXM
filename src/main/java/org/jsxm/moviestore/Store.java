package org.jsxm.moviestore;

import java.util.HashMap;
import java.util.Map;

public class Store {
	Map<Integer, Movie> movies;
	Map<Integer, Borrower> borrowers;
	
	public Store() {
		movies = new HashMap<Integer, Movie>();
		borrowers = new HashMap<Integer, Borrower>();

		addMovie(11);
		addMovie(12);
		addMovie(13);
		
		addBorrower(51);
		addBorrower(52);
		addBorrower(53);
	}
	
	public void addMovie(int movieId) {
		movies.put(new Integer(movieId), new Movie(movieId));
	}

	public void addBorrower(int borrowerId) {
		borrowers.put(new Integer(borrowerId), new Borrower(borrowerId));
	}

	public void borrowMovie(int borrowerId, int movieId) {
		Movie movie = (Movie) movies.get(new Integer(movieId));
		Borrower borrower = (Borrower) borrowers.get(new Integer(borrowerId));
		
		borrower.borrowMovie(movie);
	}

	public void returnMovie(int borrowerId) {
		Borrower borrower = (Borrower) borrowers.get(new Integer(borrowerId));

		borrower.returnMovie();
	}

}
