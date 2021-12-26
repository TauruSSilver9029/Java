package com.kpi.exception;

public class DataNotFoundException extends Exception{
    @Override
    public String getMessage(){
        return "Data is absent in table! Try one more time :)";
    }
}
