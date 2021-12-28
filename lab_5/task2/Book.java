package task5.task2;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {

    public String title;
    public String author;
    public String publisher;
    public int year;
    public int pageAmount;
    public double price;

    public Book(String title, String author, String publisher, int year, int pageAmount, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageAmount = pageAmount;
        this.price = price;
    }

    public int compareTo(Book b){
        return publisher.compareTo(b.publisher);
    }
}
