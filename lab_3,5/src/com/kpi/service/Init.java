package com.kpi.service;

import com.kpi.model.Book;
import java.time.Year;

public class Init {

    public static Book[] init(){

        Book book1 = new Book(1,"The Lord of the Rings", "J.R.R.Tolkien", "G.Allen_&_Unwin", Year.of(1968), 1186, 1436.0);
        Book book2 = new Book(2,"Pride and Prejudice", "J.R.R.Tolkien", "T.Egerton,Whitehall", Year.of(1813), 408, 103.0);
        Book book3 = new Book(3,"His Dark Materials", "P.Pullman", "Scholastic", Year.of(1995), 678, 139.90);
        Book book4 = new Book(4,"The Hitchhiker's Guide to the Galaxy", "D.Adams", "Pan_Books", Year.of(1979), 301, 169.20);
        Book book5 = new Book(5,"Harry Potter and the Goblet of Fire", "J.K.Rowling", "Bloomsbury", Year.of(2000), 636, 254.99);
        Book book6 = new Book(6,"To Kill a Mockingbird", "H.Lee", "J.B.Lippincott_&_Co.", Year.of(1960), 281, 99.0);
        Book book7 = new Book(7,"Winnie-the-Pooh", "A.A.Milne", "Methuen_&_Co.Ltd.", Year.of(1926), 195, 45.80);
        Book book8 = new Book(8,"Nineteen Eighty-Four", "G.Orwell", "Secker_&_Warburg", Year.of(1949), 326, 861.10);
        Book book9 = new Book(9,"The Lion, the Witch and the Wardrobe", "C.S.Lewis", "Geoffrey_Bles", Year.of(1950), 589, 217.0);
        Book book10 = new Book(10,"Jane Eyre", "C.Brontë", "Smith,Elder", Year.of(1847), 820, 2090.25);
        Book book11 = new Book(11,"Catch-22", "J.Heller", "Simon_&_Schuster", Year.of(1961), 453, 751.0);
        Book book12 = new Book(12,"Wuthering Heights", "E.Brontë", "T.Cautley", Year.of(1847), 373, 960.15);
        Book book13 = new Book(13,"Birdsong", "S.Faulks", "Hutchinson", Year.of(1993), 407, 128.0);
        Book book14 = new Book(14,"Rebecca", "D.Maurier", "V.Gollancz", Year.of(1938), 221, 95.90);
        Book book15 = new Book(15,"The Catcher in the Rye", "J.D.Salinger", "Little,Brown_and_Company", Year.of(1951), 234, 450.55);


        return new Book[]{
            book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15
        };
    }
}
