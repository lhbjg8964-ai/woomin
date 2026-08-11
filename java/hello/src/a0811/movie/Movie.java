package a0811.movie;

public class Movie {

    private String title;
    private String director;
    private String genre;
    private String rating;
    private boolean available;

    public Movie(String title, String director, String genre, String rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "제목 : " + title
                + ", 감독 : " + director
                + ", 장르 : " + genre
                + ", 등급 : " + rating
                + ", 상태 : " + (available ? "대여 가능" : "대여 중");
    }
}