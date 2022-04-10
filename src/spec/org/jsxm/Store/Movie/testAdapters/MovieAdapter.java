package jsxm.testAdapters;

import org.jsxm.moviestore.Movie;

public class MovieAdapter {

	private Movie movie = new Movie(11);

	public Movie getMovie() {
		return movie;
	}
	
	public String isAvailable() {
		return "isAvailableOut_"+ movie.isAvailable();
	}

	public String setBorrowed() {
		try {
			movie.setBorrowed();
		} catch (Exception e) {
			return "setBorrowed_Error";
		}
		return "setBorrowedOut";
	}

	public String release() {
		try {
			movie.release();
		} catch (Exception e) {
			return "release_Error";
		}
		return "releaseOut";
	}
}
