package com.epam.intro.subtask9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Book> books;

    public Shop(List<Book> books) {
        this.books = books;
    }

    public Shop() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooksByAuthor(String author) {
        return books.stream().filter(it -> it.getAuthors().contains(author)).collect(Collectors.toList());
    }

    public List<Book> getBooksByPublishing(String publishing) {
        return books.stream().filter(it -> it.getPublishing().equals(publishing)).collect(Collectors.toList());
    }

    public List<Book> getBooksByYear(int year) {
        return books.stream().filter(it -> it.getYear() > year).collect(Collectors.toList());
    }

}
