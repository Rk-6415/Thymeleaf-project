package com.example.newproject.modal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String author;
    private String genre;
    private Double price;

    public Book() {
    }

    public Book(Integer id, String title, String author, String genre, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    // Getters

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }

    // Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}