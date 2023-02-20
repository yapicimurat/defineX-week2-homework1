package org.example.model.abst;

import org.example.model.HouseType;
import org.example.model.RoomType;
import org.example.model.conc.Room;
import java.util.List;

public abstract class House {
    protected HouseType houseType;
    protected Double price;
    protected Double volumeInSquareMeter;
    protected List<Room> rooms = List.of();

    public HouseType getHouseType() {
        return houseType;
    }

    public Double getVolumeInSquareMeter() {
        return rooms.stream().map(Room::getVolumeInSquareMeter)
                .reduce(0.0, Double::sum);
    }

    public Double getPrice() {
        return price;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getRoomCount(){
        return rooms.size();
    }

    public int getRoomCountByRoomType(RoomType roomType){
        return (int)rooms.stream().filter(room -> room.getRoomType() == roomType)
                .count();
    }

    @Override
    public String toString() {
        return  "houseType=" + houseType +
                ", price=" + price +
                ", volumeInSquareMeter=" + volumeInSquareMeter +
                ", rooms=";
    }
}
