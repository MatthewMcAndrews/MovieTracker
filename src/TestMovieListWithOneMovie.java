import junit.framework.TestCase;

public class TestMovieListWithOneMovie extends TestCase {

    private final MovieList movieList = new MovieList();
    private final Movie starWars = new Movie();

    public void testEmptyListSize() {
        assertEquals("Size of empty list should be 0.", 0, movieList.size());
    }

    public void testSizeAfterAddingOne() {
        movieList.Add(starWars);
        assertEquals("Size of one item list should be 1.", 1, movieList.size());
    }

}