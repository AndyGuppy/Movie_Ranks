package example.codeclan.com.movies;


import java.util.ArrayList;

/**
 * Created by Andy Guppy on 16/01/2017.
 */
public class Rankings implements Rankable{
    private ArrayList<Movie> movies;

    public Rankings(){
        movies = new ArrayList<Movie>();
        setupRanks();
    }
    //this is a constructor
    public Rankings(ArrayList<Movie> movies){
        movies = new ArrayList<Movie>(movies);
    }

    public ArrayList<Movie> getRank(){
        return new ArrayList<Movie>(movies);
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addByRank(int index, Movie movie) {
        movies.add(index, movie);
    }

    public Movie getByIndex(int index) {
        return movies.get(index);
    }

    public Movie getByRank(int rank) {
        return movies.get(rank - 1);
    }

    public int getRankSize() {
        return movies.size();

    }

    public void replaceLast(Movie movie) {
        int index = getRankSize() - 1;
        movies.set(index, movie);

    }
    private void setupRanks(){
        Movie movie = new Movie("Topgun","Action",movies.size());
        movies.add(movie);
        movie = new Movie("A Nightmare on Elm Street ","Horror",movies.size());
        movies.add(movie);
        movie = new Movie("The Matrix ","Action",movies.size());
        movies.add(movie);
        movie = new Movie("JungleBook ","Children",movies.size());
        movies.add(movie);
        movie = new Movie("Beverley Hills Cop ","Comedy",movies.size());
        movies.add(movie);
        movie = new Movie("Highlander ","Action",movies.size());
        movies.add(movie);
        movie = new Movie("The Exorcist ","Horror",movies.size());
        movies.add(movie);
        movie = new Movie("Seven ","Thriller",movies.size());
        movies.add(movie);
        movie = new Movie("Inception ","Thriller",movies.size());
        movies.add(movie);
        movie = new Movie("Ice Age ","Children",movies.size());
        movies.add(movie);


    }




}
