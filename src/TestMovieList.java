import junit.framework.TestCase;

public class TestMovieList extends TestCase {

    public void testEmptyListSize() {
        MovieList emptyList = new MovieList();
        assertEquals("Size of empty list should be 0.", 0, emptyList.size());
    }

    public void testSizeAfterAddingOne() {
        Movie starWars = new Movie();
        MovieList oneItemList = new MovieList();
        oneItemList.Add(starWars);
        assertEquals("Size of one item list should be 1.", 1, oneItemList.size());
    }

}
