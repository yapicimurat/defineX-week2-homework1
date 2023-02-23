package org.example.model.conc;

import org.example.model.RoomType;

public class Room {

    public Room(RoomType roomType, Double areaInSquareMeter){
        this.roomType = roomType;
        this.areaInSquareMeter = areaInSquareMeter;
    }
    private RoomType roomType;
    private Double areaInSquareMeter;
    public RoomType getRoomType() {
        return roomType;
    }

    public Double getVolumeInSquareMeter() {
        return areaInSquareMeter;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", volumeInSquareMeter=" + areaInSquareMeter +
                '}';
    }
}
