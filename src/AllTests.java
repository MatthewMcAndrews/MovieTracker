import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for MovieTracker");
        suite.addTest(new TestSuite(TestEmptyMovieList.class));
        suite.addTest(new TestSuite(TestMovieListWithOneMovie.class));
        suite.addTest(new TestSuite(TestMovieListWithTwoMovies.class));
        return suite;
    }

}