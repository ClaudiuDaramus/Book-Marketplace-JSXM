package jsxm.testAdapters;

import org.jsxm.moviestore.*;

public class StoreAdapter {
	private Store store = new Store();
	
	public Store getStore() {return store;}

	public String addMovie(int movie) {
		try {
			store.addMovie(movie);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "addMovieOut";
	}

	public String addBorrower(int borrower) {
		try {
			store.addBorrower(borrower);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "addBorrowerOut";
	}
	
	public String borrowMovie(int borrower, int movie) {
		try {
			store.borrowMovie(borrower, movie);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "borrowMovieOut";
	}
	public String returnMovie(int borrower) {
		try {
			store.returnMovie(borrower);
		} catch (Exception e) {
			return "returnMovie_Error";
		}
		return "returnMovieOut";
	}

}
