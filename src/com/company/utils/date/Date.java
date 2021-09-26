package com.company.utils.date;

import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

public class Date {
    byte day;
    byte month;
    int year;

    public Date(int day, int month, int year) throws DayException, MonthException, YearException {

        if(day > 31 || day < 1 )  {
            throw new DayException();
        }
        if(month > 12 || month < 1){
            throw new MonthException();
        }
        if(year <= 0){
            throw new YearException();
        }

        this.day = (byte) day;
        this.month = (byte) month;
        this.year = year;

    }


}
