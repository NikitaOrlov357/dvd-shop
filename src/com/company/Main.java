package com.company;

import com.company.utils.date.Date;
import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

public class Main {

    public static void main(String[] args) throws DayException, YearException, MonthException {
        new Date (11,19,2011);
    }
}
