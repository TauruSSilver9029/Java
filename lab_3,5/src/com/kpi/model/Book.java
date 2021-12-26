package com.kpi.model;

import java.time.Year;

public class Book {
    private long id;
    private String name;
    private String author;
    private String publishing;
    private Year publishYear;
    private int pagesAmount;
    private double price;

    public Book(long id, String name, String author, String publishing, Year publishYear, int pagesAmount, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.publishYear = publishYear;
        this.pagesAmount = pagesAmount;
        this.price = price;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublishing(){
        return publishing;
    }

    public void setPublishing(String publishing){
        this.publishing = publishing;
    }

    public Year getPublishYear(){
        return publishYear;
    }

    public void setPublishYear(Year publishYear){
        this.publishYear = publishYear;
    }

    public int getPagesAmount(){
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount){
        this.pagesAmount = pagesAmount;
    }

    public double getPrise(){
        return price;
    }

    public void setPrise(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " +
                "Id: " + id +
                ", Name: " + name +
                ", Author: " + author +
                ", Publishing: " + publishing +
                ", Year of publishing: " + publishYear +
                ", Amount of pages: " + pagesAmount+
                ", Price: " + price;
    }
}
