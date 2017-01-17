package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Andy Guppy on 16/01/2017.
 */
public class MovieTest {
    Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie("Topgun", "Action", 2);
    }

    @Test
    public void canSetupMovie() {
        assertNotNull(new Movie("Topgun", "Action", 2));
    }

    @Test
    public void canGetMovieTitle() {
        assertEquals("Topgun", movie.getTitle());
    }

    @Test
    public void canGetMovieGenre() {
        assertEquals("Action", movie.getGenre());
    }

    @Test
    public void canGetMovieRank() {
        assertEquals(2, movie.getRank());
    }

    @Test
    public void canoverride() {
        System.out.println(movie.toString());
        assertEquals("Title: Topgun, Genre:  Action, Rank: 2", movie.toString());
    }
}