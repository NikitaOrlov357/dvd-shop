package com.company.utils.date.exceptions;

public class MonthException extends DateException{
    public MonthException(){
        super(new Throwable("The month is incorrect"));
    }
}
