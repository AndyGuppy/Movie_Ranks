package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
/**
 * Created by Andy Guppy on 16/01/2017.
 */
public class RankTest {

    Rankings rank;
    Movie movie;
    Movie movie2;

    @Before
    public void setUp() throws Exception {
        rank = new Rankings();
        movie = new Movie("Shrek", "Comedy", rank.getRankSize());
        movie2 = new Movie("50 Shades of Grey", "Porn", rank.getRankSize());
    }

    @Test
    public void canRanksTest() {
        assertNotNull(rank.getRank());
    }

    @Test
    public void canRanksSizeTest() {
        assertEquals(10,rank.getRankSize());
    }

    @Test
    public void canAddMovie(){
        rank.addMovie(movie);
        assertEquals(11, rank.getRankSize());
    }

    @Test
    public void canAddByRank(){
        rank.addByRank(5, movie);
        assertEquals(movie,rank.getByIndex(5));
    }

    @Test
    public void canGetbyRank(){
        rank.addByRank(5, movie);
        assertEquals(movie,rank.getByRank(6));
    }
    @Test
    public void canReplaceLastMovie(){

        rank.replaceLast(movie);
        assertEquals(movie, rank.getByIndex(9));
    }


}
