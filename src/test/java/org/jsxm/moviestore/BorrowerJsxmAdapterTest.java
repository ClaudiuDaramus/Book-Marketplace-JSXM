package org.jsxm.moviestore;
import jsxm.testAdapters.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BorrowerJsxmAdapterTest{

    @Test
    public void test_k2_1_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_2_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_3_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_4_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_5_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_6_borrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_7_borrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_8_borrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_9_borrowMovieNotAvailablePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_10_borrowMovieNotAvailablePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_11_canBorrowMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_12_canBorrowMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_13_borrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_14_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_15_borrowMovieNotAvailablePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_16_canBorrowMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_17_canBorrowMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_18_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_19_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_20_borrowMoviePF_borrowMovieCannotBorrowPF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_21_borrowMoviePF_returnMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_22_borrowMoviePF_returnMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_23_borrowMoviePF_canNotBorrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_24_borrowMoviePF_canNotBorrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_25_borrowMoviePF_canNotBorrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_26_borrowMovieNotAvailablePF_borrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_27_borrowMovieNotAvailablePF_borrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_28_borrowMovieNotAvailablePF_borrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_29_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_30_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_31_borrowMovieNotAvailablePF_canBorrowMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_32_borrowMovieNotAvailablePF_canBorrowMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_33_canBorrowMoviePF_borrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_34_canBorrowMoviePF_borrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_35_canBorrowMoviePF_borrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_36_canBorrowMoviePF_borrowMovieNotAvailablePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_37_canBorrowMoviePF_borrowMovieNotAvailablePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_38_canBorrowMoviePF_canBorrowMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_39_canBorrowMoviePF_canBorrowMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_40_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_41_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_42_borrowMoviePF_returnMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_43_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_44_borrowMovieNotAvailablePF_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_45_borrowMovieNotAvailablePF_borrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_46_borrowMovieNotAvailablePF_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_47_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_48_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_49_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_50_borrowMovieNotAvailablePF_canBorrowMoviePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_51_borrowMovieNotAvailablePF_canBorrowMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_52_borrowMovieNotAvailablePF_canBorrowMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_53_canBorrowMoviePF_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_54_canBorrowMoviePF_borrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_55_canBorrowMoviePF_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_56_canBorrowMoviePF_borrowMovieNotAvailablePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_57_canBorrowMoviePF_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_58_canBorrowMoviePF_borrowMovieNotAvailablePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_59_canBorrowMoviePF_canBorrowMoviePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_60_canBorrowMoviePF_canBorrowMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_61_canBorrowMoviePF_canBorrowMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_62_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_63_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_64_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_65_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_66_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_67_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_68_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_69_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_70_borrowMoviePF_returnMoviePF_borrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_71_borrowMoviePF_returnMoviePF_borrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_72_borrowMoviePF_returnMoviePF_borrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_73_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_74_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_75_borrowMoviePF_returnMoviePF_canBorrowMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_76_borrowMoviePF_returnMoviePF_canBorrowMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_77_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_78_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_79_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_80_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_borrowMovieCannotBorrowPF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_81_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_canNotBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
    }

    @Test
    public void test_k2_82_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_borrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
    }

    @Test
    public void test_k2_83_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_borrowMovieNotAvailablePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(borrowedMovie()));
    }

    @Test
    public void test_k2_84_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_canBorrowMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
    }

    @Test
    public void test_k2_85_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_86_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_87_borrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_88_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_89_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_90_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_91_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_92_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_93_borrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_94_borrowMoviePF_returnMoviePF_borrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_95_borrowMoviePF_returnMoviePF_borrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_96_borrowMoviePF_returnMoviePF_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_97_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_98_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_99_borrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_100_borrowMoviePF_returnMoviePF_canBorrowMoviePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_101_borrowMoviePF_returnMoviePF_canBorrowMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_102_borrowMoviePF_returnMoviePF_canBorrowMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_103_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_104_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_105_borrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_106_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_borrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_107_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_borrowMovieNotAvailablePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("borrowMovie_NotAvailable", obj.borrowMovie(borrowedMovie()));
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_108_borrowMoviePF_canNotBorrowMoviePF_returnMoviePF_canBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("canBorrowOut_true", obj.canBorrow());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_109_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_borrowMovieCannotBorrowPF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("borrowMovie_CannotBorrow", obj.borrowMovie(availableMovie()));
        assertEquals("returnMovieOut", obj.returnMovie());
    }

    @Test
    public void test_k2_110_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_returnMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
        assertEquals("returnMovie_Error", obj.returnMovie());
    }

    @Test
    public void test_k2_111_borrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_canNotBorrowMoviePF_returnMoviePF() {
        BorrowerAdapter obj = new BorrowerAdapter();
        assertEquals("borrowMovieOut", obj.borrowMovie(availableMovie()));
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("canBorrowOut_false", obj.canBorrow());
        assertEquals("returnMovieOut", obj.returnMovie());
    }

//
// Helper methods for definitions...
//

    private MovieAdapter availableMovie() {
        MovieAdapter availableMovie = new MovieAdapter();
        return availableMovie;
    }
    private MovieAdapter borrowedMovie() {
        MovieAdapter borrowedMovie = new MovieAdapter();
        try {
            borrowedMovie.setBorrowed();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return borrowedMovie;
    }

}
// End of generated Test Case

