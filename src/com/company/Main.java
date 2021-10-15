package com.company;

import com.company.dao.DvdDao;
import com.company.dao.exceptions.UnableToLoadException;
import com.company.dao.exceptions.UnableToSaveException;
import com.company.dto.Dvd;
import com.company.dto.Fields;
import com.company.service.DvdService;
import com.company.utils.date.Date;
import com.company.utils.date.exceptions.DayException;
import com.company.utils.date.exceptions.MonthException;
import com.company.utils.date.exceptions.YearException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) throws DayException, YearException, MonthException, UnableToLoadException, UnableToSaveException {

        Dvd dvd1 = new Dvd("один", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");
        Dvd dvd2 = new Dvd("два", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");
        Dvd dvd3 = new Dvd("три", 23,3,2011,5,"Jorj",
                "jorj`s","robert was there");

        DvdService dvdService = new DvdService();
        dvdService.addDvd(dvd1);
        dvdService.addDvd(dvd2);
        dvdService.addDvd(dvd3);


        dvdService.editDvd("два", Fields.DATE);

//        DvdDao dvdDao = new DvdDao();
//        dvdDao.save(dvdArrayList);
//        ArrayList <Dvd> dvdArrayList1 = dvdDao.load();
//        System.out.println(dvdArrayList1);
//
//        ArrayList <Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add(3);
//        integerArrayList.add(5);
//        integerArrayList.add(4);
//        integerArrayList.add(42);
//        integerArrayList.add(44);
//
//        ListIterator<Integer> iterator = integerArrayList.listIterator();
//
//        while (iterator.hasNext()){
//            if(iterator.next() == 5){
//                iterator.remove();
//            }
//        }
//        System.out.println(integerArrayList);


    }
}
