package com.kpi.validator;

import com.kpi.exception.DataNotFoundException;
import com.kpi.exception.NumberEnteredException;
import com.kpi.exception.StringEnteredException;
import com.kpi.exception.WrongChosenOptionException;
import com.kpi.model.Book;

public class DataValidator {
    public boolean validateOption(int option){ // Returns true if option is between 1 and 5
        try {
            if (option < 1 || option > 5)
            {
                throw new WrongChosenOptionException();
            }
        }catch (WrongChosenOptionException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean validateSearchResults(Book[]books){ // Returns true if books is not null
        try {
            if (books == null) {
                throw new DataNotFoundException();
            }
        }catch (DataNotFoundException e){
            System.out.println(e.getMessage());
            return  false;
        }
        return true;
    }

    public boolean validateString(String data){ // Returns true if input is String
        try {
            if (data.matches("\\d*")) {
                throw new NumberEnteredException();
            }
        }catch (NumberEnteredException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean validateNumber(String data){ // Returns true if input is number
        try {
            if (!data.matches("\\d*")) {
                throw new StringEnteredException();
            }
        }catch (StringEnteredException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
