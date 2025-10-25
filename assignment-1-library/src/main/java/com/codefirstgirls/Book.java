package com.codefirstgirls;

public class Book extends LibraryItem {
    private String author;
    private final Genre genre;

    public Book(String title, String author, Genre genre) {
        super(title);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String formatGenre() {
        return genre.name().toLowerCase();
    }

    @Override
    public String getSummary() {
        return getTitle() + " by " + author + " (" + formatGenre() + ")";
    }
}
