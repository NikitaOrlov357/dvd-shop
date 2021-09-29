package com.company;

import com.company.utils.date.Date;
import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

public class Main {

    public static void main(String[] args) throws DayException, YearException, MonthException {
        Date d = new Date (12,12,2012);
        Date b = new Date (11,11,2011);
        System.out.println(d);
        System.out.println(d.compareTo(b));
    }
}
