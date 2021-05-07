package com.epam.intro.subtask9;

import java.util.List;

public class Book {
    private int id;
    private String name;
    private List<String> authors;
    private String publishing;
    private int year;
    private int pages;
    private double price;
    private int type;

    public Book(int id, String name, List<String> authors, String publishing, int year, int pages, double price, int type) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
