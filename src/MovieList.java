import java.util.ArrayList;
import java.util.Collection;

public class MovieList {
    private Collection movies = new ArrayList();

    public int size() {
        return movies.size();
    }

    public void Add(Movie movieToAdd) {
        movies.add(movieToAdd);
    }

    public boolean contains(Movie movieToCheckFor) {
        return movies.contains(movieToCheckFor);
    }
}
