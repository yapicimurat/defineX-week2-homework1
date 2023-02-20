package org.example.model.conc;

import org.example.model.HouseType;
import org.example.model.abst.House;

import java.util.List;

public class SummerHouse extends House {
    public SummerHouse(Double price, List<Room> rooms){
        this.houseType = HouseType.NORMAL;
        this.price = price;
        this.rooms = rooms;
        this.volumeInSquareMeter = getVolumeInSquareMeter();
    }
}