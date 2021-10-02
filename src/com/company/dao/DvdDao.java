package com.company.dao;

import com.company.dto.Dvd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class DvdDao {
    public void save (ArrayList<Dvd> dvdList){
        try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data/dvd.data"))){
            o.writeObject(dvdList);
        }
        catch (IOException exception){

        }

    }
    public void load(){

    }

}
