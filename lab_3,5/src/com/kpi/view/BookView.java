package com.kpi.view;

import com.kpi.model.Book;
import com.kpi.validator.DataValidator;

public class BookView {
    DataValidator validator = new DataValidator();

    public final String INPUT_INT_OPTION = "Enter option: ";
    public final String INPUT_STRING_AUTHOR = "Enter author name: ";
    public final String INPUT_STRING_PUBLISH = "Enter publishing name: ";
    public final String INPUT_YEAR = "Enter year of publishing: ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void processProgram(){
        System.out.println();
        System.out.println("Choose one of options below: ");
        System.out.println("1 - To get all books");
        System.out.println("2 - To get all books by certain author");
        System.out.println("3 - To get all books by certain publishing");
        System.out.println("4 - To get all books published after certain year");
        System.out.println("5 - Exit");
    }

    public void printBookInfo(Book[] books){
       if(validator.validateSearchResults(books)){
            for (var b : books) System.out.println(b.toString());
        }
    }
}
