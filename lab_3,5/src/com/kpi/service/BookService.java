package com.kpi.service;

import com.kpi.model.Book;

import java.io.File;
import java.io.FileWriter;
import java.time.Year;
import java.util.Arrays;

public class BookService {
    private Book[] books;
    private String booksSearchingResults = "";

    public void validateInputData(String yesOrNo) {
        try {
            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                InputReader reader = new InputReader();
                boolean fileIsEmpty = reader.isEmpty();
                if (fileIsEmpty) {
                    books = reader.readFromFile();
                }
                else {
                    System.out.println("Initiating from storage...");
                    books = Init.init();
                }
            } else {
                System.out.println("Initiating from storage...");
                books = Init.init();
            }
        } catch (Exception e) {
            System.out.println("Error occurred while data init!");
            books = Init.init();
        }
    }

    public void writeResultToFile(String yesOrNo) {
        try {
            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
                File resultsFile = new File("/Users/elizavetabojko/Programming/Основы ПЗ Java/lab1_v13/src/com/kpi/data/results.txt");
                if (!resultsFile.exists()) {
                    System.out.println("Creating file for results...");
                    resultsFile.createNewFile();
                }
                FileWriter writer = new FileWriter(resultsFile, true);
                writer.write(booksSearchingResults);
                System.out.println("Data was saved to " + resultsFile.getName());
                writer.close();
            }
        } catch (Exception e) {
            System.out.println("Error occurred while creating and filling the file!");
        }

    }

    public Book[] getBooks() {
        booksSearchingResults = "\n\nResults of getting all books:";
        for (var book : books) {
            booksSearchingResults += "\n" + book;
        }
        return books;
    }

    public Book[] getAllBooksByAuthor(String authorName) {

        int foundBooksCounter = 0;
        booksSearchingResults = "\n\nResults of searching books by author - " + authorName + ":\n";
        Book[] foundBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().contains(authorName)) {
                foundBooks[foundBooksCounter] = books[i];
                foundBooksCounter++;
                booksSearchingResults += books[i]+"\n";
            }
        }

        if (foundBooksCounter == 0) return null;

        return Arrays.copyOf(foundBooks, foundBooksCounter);
    }

    public Book[] getAllBooksByPublishing(String publishingName) {
        int foundBooksCounter = 0;
        booksSearchingResults = "\n\nResults of searching books by publishing - " + publishingName + ":\n";
        Book[] foundBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishing().contains(publishingName)) {
                foundBooks[foundBooksCounter] = books[i];
                foundBooksCounter++;
                booksSearchingResults += books[i]+"\n";
            }
        }

        if (foundBooksCounter == 0) return null;

        return Arrays.copyOf(foundBooks, foundBooksCounter);
    }

    public Book[] getAllBooksPublishedAfterYear(Year year) {
        int foundBooksCounter = 0;
        booksSearchingResults = "\n\nResults of searching books published after " + year + " year:\n";
        Book[] foundBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishYear().isAfter(year)) {
                foundBooks[foundBooksCounter] = books[i];
                foundBooksCounter++;
                booksSearchingResults += books[i] +"\n";
            }
        }

        if (foundBooksCounter == 0) return null;

        return Arrays.copyOf(foundBooks, foundBooksCounter);
    }
}
