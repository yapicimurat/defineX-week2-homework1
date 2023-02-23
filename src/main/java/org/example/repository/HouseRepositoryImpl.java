package org.example.repository;

import org.example.model.HouseType;
import org.example.model.RoomType;
import org.example.model.abst.House;
import org.example.model.conc.NormalHouse;
import org.example.model.conc.Room;
import org.example.model.conc.SummerHouse;
import org.example.model.conc.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseRepositoryImpl implements HouseRepository{
    private List<House> houses = new ArrayList<>();

    public HouseRepositoryImpl(){
        List<Room> normalHouse1Rooms = List.of(
                new Room(RoomType.NORMAL, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 20.0),
                new Room(RoomType.LIVING_ROOM, 20.0),
                new Room(RoomType.NORMAL, 20.0)
        );

        List<Room> normalHouse2Rooms = List.of(
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 20.0),
                new Room(RoomType.LIVING_ROOM, 45.0),
                new Room(RoomType.NORMAL, 20.0),
                new Room(RoomType.NORMAL, 20.0),
                new Room(RoomType.NORMAL, 5.0),
                new Room(RoomType.NORMAL, 10.0)
        );

        List<Room> normalHouse3Rooms = List.of(
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 20.0),
                new Room(RoomType.LIVING_ROOM, 20.0),
                new Room(RoomType.NORMAL, 20.0)
        );

        House normalHouse1 = new NormalHouse(50.0, normalHouse1Rooms);
        House normalHouse2 = new NormalHouse(88.0, normalHouse2Rooms);
        House normalHouse3 = new NormalHouse(430.0, normalHouse3Rooms);

        List<Room> villaHouse1Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 30.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 30.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        List<Room> villaHouse2Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 30.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 30.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        List<Room> villaHouse3Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        House villaHouse1 = new Villa(150.0, villaHouse1Rooms);
        House villaHouse2 = new Villa(250.0, villaHouse2Rooms);
        House villaHouse3 = new Villa(120.0, villaHouse3Rooms);

        List<Room> summerHouse1Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        List<Room> summerHouse2Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        List<Room> summerHouse3Rooms = List.of(
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 12.0),
                new Room(RoomType.NORMAL, 15.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.NORMAL, 10.0),
                new Room(RoomType.KITCHEN, 22.0),
                new Room(RoomType.KITCHEN, 20.0),
                new Room(RoomType.BATH_ROOM, 10.0),
                new Room(RoomType.BATH_ROOM, 6.0),
                new Room(RoomType.LIVING_ROOM, 40.0)
        );

        House summerHouse1 = new SummerHouse(200.0, summerHouse1Rooms);
        House summerHouse2 = new SummerHouse(200.0, summerHouse2Rooms);
        House summerHouse3 = new SummerHouse(20.0, summerHouse3Rooms);

        save(normalHouse1);
        save(normalHouse2);
        save(normalHouse3);

        save(summerHouse1);
        save(summerHouse2);
        save(summerHouse3);

        save(villaHouse1);
        save(villaHouse2);
        save(villaHouse3);
    }

    @Override
    public List<House> getAllByHouseType(HouseType houseType) {
        return houses.stream().filter(house -> house.getHouseType() == houseType).collect(Collectors.toList());
    }

    @Override
    public List<House> getAll() {
        return houses;
    }

    @Override
    public void save(House house) {
        houses.add(house);
    }
}
