package com.company.dao;

import com.company.dao.exceptions.UnableToLoadException;
import com.company.dao.exceptions.UnableToSaveException;
import com.company.dto.Dvd;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;

public class DvdDao {
    public  void save(ArrayList<Dvd> dvdList) throws UnableToSaveException {
        try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data/dvd.data"))){
            o.writeObject(dvdList);
        }
        catch (IOException exception){
            throw new UnableToSaveException(exception);
        }
    }

    public ArrayList<Dvd> load() throws UnableToLoadException{
        try(ObjectInputStream o = new ObjectInputStream(new FileInputStream("data/dvd.data"))){
            return (ArrayList<Dvd>)o.readObject();
        }
        catch (Exception exception){
            throw new UnableToLoadException(exception);
        }
    }
}
