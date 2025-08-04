package hafta3_patika_practices.film_koleksiyon_filtreleme;

public class Movie {
    private String title;

    private int releasedYear;

    private String genre;

    private double imdbRating;

    public Movie(String title, String genre, int releasedYear, double imdbRating) {
        this.title = title;
        this.genre = genre;
        this.releasedYear = releasedYear;
        this.imdbRating = imdbRating;
    }

    public String getTitle() {
        return title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public String getGenre() {
        return genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releasedYear=" + releasedYear +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
