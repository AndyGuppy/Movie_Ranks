package example.codeclan.com.movies;

/**
 * Created by Andy Guppy on 16/01/2017.
 */
public class Movie {
    private String title;
    private int rank;
    private String genre;

    public Movie(String title, String genre, int rank) {
        this.title = title;
        this.genre = genre;
        this.rank = rank;
    }

    public String getTitle() {
        return this.title;

    }

    public String getGenre() {
        return this.genre;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre:  " + genre + ", Rank: " + rank;
    }
}
