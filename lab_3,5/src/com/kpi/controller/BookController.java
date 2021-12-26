package com.kpi.controller;

import com.kpi.service.BookService;
import com.kpi.service.InputUtility;
import com.kpi.view.BookView;

import java.time.Year;

public class BookController {
    private int option = 0;
    private BookService service = new BookService();
    private BookView view = new BookView();

    public void runProgram(){
        service.validateInputData(InputUtility.readFromFile(view));
        while (option >= 0 && option <= 5 && option != 5) {
            view.processProgram();
            option = InputUtility.inputIntTypeWithScanner(view);
            switch (option) {
                case 1:
                    view.printBookInfo(service.getBooks());
                    option = 0;
                    service.writeResultToFile(InputUtility.resultToFile(view));
                    break;
                case 2:
                    String authorName = InputUtility.inputStringAuthorWithScanner(view);
                    view.printBookInfo(service.getAllBooksByAuthor(authorName));
                    option = 0;
                    service.writeResultToFile(InputUtility.resultToFile(view));
                    break;
                case 3:
                    String publishName = InputUtility.inputStringPublishWithScanner(view);
                    view.printBookInfo(service.getAllBooksByPublishing(publishName));
                    option = 0;
                    service.writeResultToFile(InputUtility.resultToFile(view));
                    break;
                case 4:
                    Year publishYear = InputUtility.inputYearTypeWithScanner(view);
                    view.printBookInfo(service.getAllBooksPublishedAfterYear(publishYear));
                    option = 0;
                    service.writeResultToFile(InputUtility.resultToFile(view));
                    break;
                case 5:
                    option = 5;
                    break;
                default:
                    option = 0;
            }
        }
    }
}
