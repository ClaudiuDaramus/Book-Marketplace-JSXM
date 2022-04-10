package org.jsxm.moviestore;

public class Borrower {
	
	private int borrowerId;
	
	private Movie movie = null;

	public Borrower(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public void borrowMovie(Movie movie) {
		if (movie.isAvailable() && this.movie== null) {
			this.movie = movie;
			movie.setBorrowed();
		} else if (this.movie != null)
			throw new RuntimeException("borrowMovie_CannotBorrow");
		else
			throw new RuntimeException("borrowMovie_NotAvailable");

	}
	public void returnMovie() {
		if (movie != null) {
			movie.release();
			movie = null;
		}
		else
					throw new RuntimeException();

	}


	public boolean canBorrow() {

		return (movie == null);
	}

}