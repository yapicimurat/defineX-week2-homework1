package org.example.model.conc;

import org.example.model.HouseType;
import org.example.model.abst.House;

import java.util.List;

public class Villa extends House {

    public Villa(double price, List<Room> rooms){
        this.houseType = HouseType.VILLA;
        this.price = price;
        this.rooms = rooms;
        this.volumeInSquareMeter = getVolumeInSquareMeter();
    }
}
