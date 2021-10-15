package com.company.service;

import com.company.dto.Dvd;
import com.company.dto.Fields;
import com.company.utils.date.Date;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdService {
    private final ArrayList<Dvd> dvdArrayList = new ArrayList<>();

    public void addDvd (Dvd dvd){
        dvdArrayList.add(dvd);
    }

    public void removeDvd (String title){
        ListIterator<Dvd> iterator = dvdArrayList.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getTitle().equals(title)){
                iterator.remove();
                break;
            }
        }
    }

    public void editDvd (String title, Fields fields){
        System.out.println(fields == Fields.DATE);
    }

    public ArrayList<Dvd> getDvdArrayList() {
        return dvdArrayList;
    }
}
