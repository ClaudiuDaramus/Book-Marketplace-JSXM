package org.jsxm.moviestore;
import jsxm.testAdapters.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StoreJsxmAdapterTest{

    @Test
    public void test_k2_1_borrowMoviePF_borrowMoviePF_borrowMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
        assertEquals("borrowMovieOut", obj.borrowMovie(53, 13));
    }

    @Test
    public void test_k2_6_borrowMoviePF_borrowMoviePF_returnMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
        assertEquals("returnMovieOut", obj.returnMovie(51));
    }

    @Test
    public void test_k2_16_borrowMoviePF_borrowMoviePF_borrowMovieNotAvailablePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(53, 11));
    }

    @Test
    public void test_k2_17_borrowMoviePF_borrowMoviePF_borrowMovieCannotBorrowPF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 13));
    }

    @Test
    public void test_k2_19_borrowMoviePF_returnMoviePF_borrowMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("returnMovieOut", obj.returnMovie(51));
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
    }

    @Test
    public void test_k2_21_borrowMoviePF_borrowMovieNotAvailablePF_borrowMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
    }

    @Test
    public void test_k2_23_borrowMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
        assertEquals("returnMovieOut", obj.returnMovie(51));
    }

    @Test
    public void test_k2_25_borrowMoviePF_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
    }

    @Test
    public void test_k2_28_borrowMoviePF_borrowMovieNotAvailablePF_borrowMovieCannotBorrowPF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
    }

    @Test
    public void test_k2_30_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
        assertEquals("borrowMovieOut", obj.borrowMovie(52, 12));
    }

    @Test
    public void test_k2_32_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
        assertEquals("returnMovieOut", obj.returnMovie(51));
    }

    @Test
    public void test_k2_34_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieNotAvailablePF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(52, 11));
    }

    @Test
    public void test_k2_36_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF() {
        StoreAdapter obj = new StoreAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(51, 11));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(51, 12));
    }

//
// Helper methods for definitions...
//


}
// End of generated Test Case

