package org.example.model.conc;

import org.example.model.RoomType;

public class Room {

    public Room(RoomType roomType, Double volumeInSquareMeter){
        this.roomType = roomType;
        this.volumeInSquareMeter = volumeInSquareMeter;
    }
    private RoomType roomType;
    private Double volumeInSquareMeter;
    public RoomType getRoomType() {
        return roomType;
    }

    public Double getVolumeInSquareMeter() {
        return volumeInSquareMeter;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", volumeInSquareMeter=" + volumeInSquareMeter +
                '}';
    }
}
