package jsxm.testAdapters;

import org.jsxm.moviestore.*;

public class BorrowerAdapter {
	private Borrower borrower = new Borrower(51);
	
	public Borrower getBorrower() {return borrower;}

	public String borrowMovie(MovieAdapter movie) {
		try {
			borrower.borrowMovie(movie.getMovie());
		} catch (Exception e) {
			return e.getMessage();
		}
		return "borrowMovieOut";
	}
	public String returnMovie() {
		try {
			borrower.returnMovie();
		} catch (Exception e) {
			return "returnMovie_Error";
		}
		return "returnMovieOut";
	}


	public String canBorrow() {
		return "canBorrowOut_" + borrower.canBorrow();
	}

}
