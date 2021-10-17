package com.company.service.exceptions;

public class DvdWasNotFoundException extends Exception {
    public DvdWasNotFoundException(){super(new Throwable("Dvd was not found"));}
}
