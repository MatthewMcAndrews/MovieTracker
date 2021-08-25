import junit.framework.TestCase;

public class TestEmptyMovieList extends TestCase {

    private MovieList movieList = new MovieList();

    public void testEmptyListSize() {
        assertEquals("Size of empty list should be 0.", 0, movieList.size());
    }

}