package com.kpi.exception;

public class NumberEnteredException extends Exception{
    @Override
    public String getMessage(){
        return "Number was entered, you should enter words! Try one more time :)";
    }
}
