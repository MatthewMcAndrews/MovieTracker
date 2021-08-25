import junit.framework.TestCase;

public class TestMovieListWithTwoMovies extends TestCase {

    private final MovieList movieList = new MovieList();
    private final Movie starWars = new Movie();
    private final Movie starTrek = new Movie();
    private final Movie stargate = new Movie();

    protected void setUp() {
        movieList.Add(starWars);
        movieList.Add(starTrek);
    }

    public void testSize() {
        assertEquals("Size of a two item list should be 2.", 2, movieList.size());
    }

    public void testContents() {
        assertTrue("List should contain starWars.", movieList.contains(starWars));
        assertTrue("List should contain starTrek", movieList.contains(starTrek));
        assertFalse("List should not contain stargate", movieList.contains(stargate));
    }

}