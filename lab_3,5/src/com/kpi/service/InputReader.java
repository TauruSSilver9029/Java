package com.kpi.service;

import com.kpi.model.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Year;
import java.util.Arrays;


public class InputReader {
    public boolean isEmpty() {
        File file = new File("/Users/elizavetabojko/Programming/Основы ПЗ Java/lab1_v13/src/com/kpi/data/booksData.txt");
        if (!file.exists() || file.length() == 0) {
            System.out.println("No such file to init or it is empty!");
            return false;
        }
        return true;
    }

    public Book[] readFromFile() throws IOException {
        System.out.println("Reading from file...");
        int booksAmount = (int) Files.lines(Paths.get("/Users/elizavetabojko/Programming/Основы ПЗ Java/lab1_v13/src/com/kpi/data/booksData.txt")).count();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/elizavetabojko/Programming/Основы ПЗ Java/lab1_v13/src/com/kpi/data/booksData.txt"));
        Book[] books = new Book[booksAmount];
        String line;
        int i = 0;
        int booksCounter = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.equals("")) {
                String[] param = line.split(", ");
                books[booksCounter] = new Book(Long.parseLong(param[0]), param[1], param[2], param[3], Year.of(Integer.parseInt(param[4])),
                        Integer.parseInt(param[5]), Double.parseDouble(param[6]));
                booksCounter++;
            }
            i++;
        }
        bufferedReader.close();
        return Arrays.copyOf(books, booksCounter);
    }
}
