package org.example.model.conc;

import org.example.model.HouseType;
import org.example.model.abst.House;

import java.util.List;

public class NormalHouse extends House {

    public NormalHouse(Double price, List<Room> rooms){
        this.houseType = HouseType.NORMAL;
        this.price = price;
        this.rooms = rooms;
        this.volumeInSquareMeter = getVolumeInSquareMeter();
    }


}
