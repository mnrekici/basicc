package hafta3_patika_practices.film_koleksiyon_filtreleme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", "Sci-fi",2010,8.8));
        movies.add(new Movie("Unutursam Fısılda","Dram",2014,7.5));
        movies.add(new Movie("The Lord Of the Rings", "Fantastic",2001,8.9));
        movies.add(new Movie("Issız Adam","Dram",2008, 6.8));

        System.out.println("IMDb puanına göre sıralanmıştır (büyükten küçüğe) ");
        movies.sort((m1,m2)->Double.compare(m2.getImdbRating(), m1.getImdbRating()));

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("Yayın yılına göre sıralanmıştır (küçükten büyüğe) ");
        movies.sort(Comparator.comparingInt(Movie::getReleasedYear).reversed());

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nFiltered by genre: Sci-Fi");
        filterMoviesByGenre(movies, "Sci-Fi");

    }
    public static void filterMoviesByGenre(List<Movie> movieList, String genre) {
        for (Movie movie : movieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(movie);
            }
        }
    }
}
