package model;

import java.time.LocalDate;

public class Anime {
    private String title;
    private String author;
    private double minutes;
    private  double rating;
//    private String site;
    private LocalDate releaseDate;
    private static int animeCount = 0;
    public Anime(){
        title = "unknown";
        author = "unknown";
        minutes = 0;
        rating = 0;
        releaseDate = LocalDate.now();
        animeCount++;
    }

    public Anime(String title, String author, double minutes, double rating, LocalDate releaseDate){
        this.title = title;
        this.author = author;
        this.minutes = minutes;
        this.rating = rating;
//        this.site = site;
        this.releaseDate = releaseDate;
        animeCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getRating() {
        return rating;
    }

//    public String getSite() {
//        return site;
//    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public static int getAnimeCount() {
        return animeCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

//    public void setSite(String site) {
//        this.site = site;
//    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}

