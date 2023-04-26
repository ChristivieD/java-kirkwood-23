package model;

import utilities.Helpers;

import java.time.LocalDate;

public class Anime implements Comparable<Anime> {
    @Override
    public String toString() {
        return String.format("%-40s\t%-20s\t%10.2f\t%5d\t%-6s",
        this.title, Helpers.formatDate(this.releaseDate), this.author,
                this.type, this.season,
        this.episode, this.rating);
    }

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

    @Override
    public int compareTo(Anime o) {
        return this.title.compareTo(o.title);
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


    public static String getHeaderRow() {
        return String.format("%-40s\t%-20s\t%20s\t5s\t%-6s",
                "Title", "author", "type", "Season",
                "episode"," rating");
    }
}

