package com.kpi.exception;

public class WrongChosenOptionException extends Exception{
    @Override
    public String getMessage(){
        return "Wrong option was chosen! Try one more time :)";
    }
}
