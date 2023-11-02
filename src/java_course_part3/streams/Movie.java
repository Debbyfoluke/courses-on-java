package java_course_part3.streams;

import org.jetbrains.annotations.NotNull;

public class Movie implements Comparable<Movie>{

    private String title;
    private int likes;


    private Genre genre;



    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }
    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(@NotNull Movie movie) {
        return 0;
    }
}
