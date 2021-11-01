package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City mockcity = new City("Edmonton", "Alberta");
        list.addCity(mockcity);
        assert list.hasCity(mockcity);
    }

    @Test
    public void deleteCityTest() {
        City mockcity = new City("Edmonton", "Alberta");
        list.addCity(mockcity);
        if (list.hasCity(mockcity)) {
            int listSize = list.getCount();
           list.deleteCity(mockcity);
           assertEquals(listSize-1, list.getCount());
        }
        else {
          throw new IllegalArgumentException();
        }
    }
}
