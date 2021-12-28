package task5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogic {

    public List<Book> books;

    public BusinessLogic() {
        setUp();
    }

    public void setUp(){
         books = new ArrayList<>();

        books.add(new Book("Book1", "Author1", "Publisher1", 2021, 123, 12));
        books.add(new Book("Book2", "Author1", "Publisher1", 2021, 123, 12));
        books.add(new Book("Book3", "Author2", "Publisher1", 2021, 123, 12));
        books.add(new Book("Book4", "Author2", "Publisher1", 2021, 123, 12));
        books.add(new Book("Book5", "Author2", "Publisher2", 2021, 123, 12));
        books.add(new Book("Book6", "Author3", "Publisher2", 2021, 123, 12));
        books.add(new Book("Book7", "Author3", "Publisher2", 2021, 123, 12));
        books.add(new Book("Book8", "Author4", "Publisher3", 2001, 123, 12));
        books.add(new Book("Book9", "Author4", "Publisher2", 2000, 123, 12));
        books.add(new Book("Book10", "Author4", "Publisher2", 1999, 123, 12));
    }

    public List<Book> getByAuthor(String author){
        return books.stream().filter(i -> i.author.equals(author)).collect(Collectors.toList());
    }

    public List<Book> getByPublisher(String publisher){
        return books.stream().filter(i -> i.publisher.equals(publisher)).collect(Collectors.toList());
    }

    public List<Book> sortByPublishers(){
        return books.stream().sorted().collect(Collectors.toList());
    }

    public List<Book> getByYear(String yearD){
        return books.stream().filter(i -> i.year > Integer.parseInt(yearD)).collect(Collectors.toList());
    }
}
