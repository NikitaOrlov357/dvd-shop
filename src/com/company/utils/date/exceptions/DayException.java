package com.company.utils.date.exceptions;

public class DayException extends DateException{
    public DayException (){
        super(new Throwable("The day is incorrect"));
    }
}
