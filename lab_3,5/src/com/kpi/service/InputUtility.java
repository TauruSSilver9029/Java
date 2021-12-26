package com.kpi.service;

import com.kpi.validator.DataValidator;
import com.kpi.view.BookView;

import java.time.Year;
import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);
    private static DataValidator validator = new DataValidator();

    public static int inputIntTypeWithScanner(BookView view) {
        view.printMessage(view.INPUT_INT_OPTION);
        int option = 0;
        boolean isValid = false;
        while (!scanner.hasNextInt() && !isValid) {
            if (scanner.hasNext()) {
                validator.validateNumber(scanner.next());
                view.printMessage(view.INPUT_INT_OPTION);
            }
        }
        option = scanner.nextInt();
        if (!validator.validateOption(option)) isValid = false;
        else isValid = true;
        return option;
    }

    public static String inputStringAuthorWithScanner(BookView view) {
        view.printMessage(view.INPUT_STRING_AUTHOR);
        boolean isValid = false;
        while ((scanner.hasNextInt() || !scanner.hasNext()) && !isValid) {
            if (validator.validateString(scanner.next())) isValid = true;
            view.printMessage(view.INPUT_STRING_AUTHOR);
        }
        return scanner.next();
    }

    public static String inputStringPublishWithScanner(BookView view) {
        view.printMessage(view.INPUT_STRING_PUBLISH);
        boolean isValid = false;
        while ((scanner.hasNextInt() || !scanner.hasNext()) && !isValid) {
            if (validator.validateString(scanner.next())) isValid = true;
            view.printMessage(view.INPUT_STRING_PUBLISH);
        }
        return scanner.next();
    }

    public static Year inputYearTypeWithScanner(BookView view) {
        view.printMessage(view.INPUT_YEAR);
        boolean isValid = false;
        while (!scanner.hasNextInt() && !isValid) {
            if (validator.validateNumber(scanner.next())) isValid = true;
            view.printMessage(view.INPUT_YEAR);
        }
        return Year.of(scanner.nextInt());
    }

    public static String resultToFile(BookView view) {
        view.printMessage("Do you want to write result to a file? (Y/N) \n");
        return scanner.next();
    }

    public static String readFromFile(BookView view) {
        view.printMessage("Do you want to read data from file? (Y/N) \n");
        return scanner.next();
    }
}
