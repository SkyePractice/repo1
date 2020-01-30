package com.week9Py;

public class Resource {
    private String author;
    private String title;
    private String isbn;

    Resource() {
        author = "";
        title = "";
        isbn = "";
    }

    void setAuthor(String a) {
        author = a;
    }

    void setTitle(String t) {
        title = t;
    }

    void setIsbn(String i) {
        isbn = i;
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    String getIsbn() {
        return isbn;
    }

    public String getDetails() {
       return title + ", " + author + ", " + isbn;
    }

}
