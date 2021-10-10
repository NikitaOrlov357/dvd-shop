package com.company;

import com.company.dao.DvdDao;
import com.company.dao.exceptions.UnableToLoadException;
import com.company.dao.exceptions.UnableToSaveException;
import com.company.dto.Dvd;
import com.company.utils.date.Date;
import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DayException, YearException, MonthException, UnableToLoadException, UnableToSaveException {

        Dvd dvd1 = new Dvd("прокипрок", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");
        Dvd dvd2 = new Dvd("прокипрок", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");
        Dvd dvd3 = new Dvd("прокипрок", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");
        ArrayList <Dvd> dvdArrayList = new ArrayList<>();
        dvdArrayList.add(dvd1);
        dvdArrayList.add(dvd2);
        dvdArrayList.add(dvd3);

        DvdDao dvdDao = new DvdDao();
        dvdDao.save(dvdArrayList);
        ArrayList <Dvd> dvdArrayList1 = dvdDao.load();
        System.out.println(dvdArrayList1);

    }
}
