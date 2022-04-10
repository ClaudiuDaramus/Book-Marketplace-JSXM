package org.jsxm.moviestore;
import jsxm.testAdapters.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class MovieJsxmAdapterTest{

    @Test
    public void test_k2_2_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_3_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_4_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_5_setBorrowedPF_setBorrowedPF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("setBorrowed_Error", obj.setBorrowed());
    }

    @Test
    public void test_k2_7_movieIsAvailablePF_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_8_movieIsAvailablePF_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_9_setBorrowedPF_movieIsNotAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_10_movieIsAvailablePF_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_11_setBorrowedPF_releasePF_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_12_setBorrowedPF_releasePF_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_13_setBorrowedPF_movieIsNotAvailablePF_setBorrowedPF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("setBorrowed_Error", obj.setBorrowed());
    }

    @Test
    public void test_k2_14_movieIsAvailablePF_setBorrowedPF_setBorrowedPF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("setBorrowed_Error", obj.setBorrowed());
    }

    @Test
    public void test_k2_15_movieIsAvailablePF_movieIsAvailablePF_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_18_movieIsAvailablePF_movieIsAvailablePF_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_20_setBorrowedPF_releasePF_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_22_setBorrowedPF_movieIsNotAvailablePF_movieIsNotAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_24_movieIsAvailablePF_setBorrowedPF_movieIsNotAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_26_movieIsAvailablePF_movieIsAvailablePF_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_27_setBorrowedPF_releasePF_setBorrowedPF_setBorrowedPF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("setBorrowed_Error", obj.setBorrowed());
    }

    @Test
    public void test_k2_29_setBorrowedPF_releasePF_movieIsAvailablePF_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_31_setBorrowedPF_releasePF_movieIsAvailablePF_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_33_setBorrowedPF_movieIsNotAvailablePF_releasePF_releasePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("releaseOut", obj.release());
        assertEquals("release_Error", obj.release());
    }

    @Test
    public void test_k2_35_setBorrowedPF_movieIsNotAvailablePF_releasePF_movieIsNotAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_37_setBorrowedPF_movieIsNotAvailablePF_movieIsNotAvailablePF_setBorrowedPF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("setBorrowed_Error", obj.setBorrowed());
    }

    @Test
    public void test_k2_1_movieIsAvailablePF_setBorrowedPF_releasePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_2_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_3_setBorrowedPF_releasePF_setBorrowedPF_movieIsNotAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_4_setBorrowedPF_releasePF_movieIsAvailablePF_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_5_setBorrowedPF_movieIsNotAvailablePF_releasePF_setBorrowedPF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("releaseOut", obj.release());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_6_setBorrowedPF_movieIsNotAvailablePF_movieIsNotAvailablePF_movieIsNotAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
    }

    @Test
    public void test_k2_7_setBorrowedPF_releasePF_setBorrowedPF_releasePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_8_setBorrowedPF_releasePF_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_9_setBorrowedPF_movieIsNotAvailablePF_releasePF_movieIsAvailablePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

    @Test
    public void test_k2_10_setBorrowedPF_movieIsNotAvailablePF_movieIsNotAvailablePF_releasePF_movieIsAvailablePF_movieIsAvailablePF() {
        MovieAdapter obj = new MovieAdapter();
        assertEquals("setBorrowedOut", obj.setBorrowed());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("isAvailableOut_false", obj.isAvailable());
        assertEquals("releaseOut", obj.release());
        assertEquals("isAvailableOut_true", obj.isAvailable());
        assertEquals("isAvailableOut_true", obj.isAvailable());
    }

//
// Helper methods for definitions...
//


}
// End of generated Test Case

