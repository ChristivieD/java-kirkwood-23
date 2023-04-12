package model;

import java.time.LocalDate;

public class Anime implements Comparable<Anime> {
    private String title;
    private String author;
    private String type;
    private int season;
    private  int episode;
    private  double rating;
    private LocalDate releaseDate;
    private static int animeCount = 0;
    public Anime(){
        title = "unknown";
        author = "unknown";
        type = "unknown";
        season = 0;
        episode = 0;
        rating = 0;
        releaseDate = LocalDate.now();
        animeCount++;
    }

    public Anime(String title, String author, String type, int season, int episode, double rating, LocalDate releaseDate){
        this.title = title;
        this.author = author;
        this.type = type;
        this.season = season;
        this.episode = episode;
        this.rating = rating;
        this.releaseDate = releaseDate;
        animeCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisode() {
        return episode;
    }

    public double getRating() {
        return rating;
    }

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

    public void setType(String type) {
        this.type = type;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int compareTo(Anime o) {
        return this.title.compareTo(o.title);
    }
}

