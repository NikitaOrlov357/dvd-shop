package com.company.utils.date;

import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

public class Date implements Comparable<Date>{
    private final int day;
    private final int month;
    private final int year;

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

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    @Override
    public int compareTo(Date o) {
        if(this.year > o.getYear()){
            return 1;
        }
        else if(this.year < o.getYear()){
            return -1;
        }
        else {
            if(this.month > o.getMonth()){
                return 1;
            }
            else if (this.month < o.getMonth()){
                return -1;
            }
            else {
                return Integer.compare(this.day, o.getDay());
            }
        }
    }
}
