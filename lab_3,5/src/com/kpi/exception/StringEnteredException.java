package com.kpi.exception;

public class StringEnteredException extends Exception{
    @Override
    public String getMessage(){
        return "String was entered, you should enter numbers! Try one more time :)";
    }
}
