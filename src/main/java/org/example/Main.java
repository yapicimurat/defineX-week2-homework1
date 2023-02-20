package org.example;

import org.example.model.RoomType;
import org.example.model.abst.House;
import org.example.model.conc.NormalHouse;
import org.example.model.conc.Room;
import org.example.model.conc.SummerHouse;
import org.example.model.conc.Villa;
import org.example.repository.HouseRepositoryImpl;
import org.example.service.HouseService;
import org.example.service.HouseServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        House normalHouse1 = new NormalHouse(550000.0, normalHouse1Rooms);
        House normalHouse2 = new NormalHouse(880000.0, normalHouse2Rooms);
        House normalHouse3 = new NormalHouse(430000.0, normalHouse3Rooms);

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

        House villaHouse1 = new Villa(1500000.0, villaHouse1Rooms);
        House villaHouse2 = new Villa(2500000.0, villaHouse2Rooms);
        House villaHouse3 = new Villa(1250000.0, villaHouse3Rooms);

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

        House summerHouse1 = new SummerHouse(2000000.0, summerHouse1Rooms);
        House summerHouse2 = new SummerHouse(2000000.0, summerHouse2Rooms);
        House summerHouse3 = new SummerHouse(2000000.0, summerHouse3Rooms);

        HouseService houseService = new HouseServiceImpl(new HouseRepositoryImpl());

        houseService.createHouse(normalHouse1);
        houseService.createHouse(normalHouse2);
        houseService.createHouse(normalHouse3);

        houseService.createHouse(villaHouse1);
        houseService.createHouse(villaHouse2);
        houseService.createHouse(villaHouse3);

        houseService.createHouse(summerHouse1);
        houseService.createHouse(summerHouse2);
        houseService.createHouse(summerHouse3);

        houseService.getAll()
                .forEach(house -> {
                    System.out.printf(house.toString());
                    house.getRooms().forEach(System.out::println);
                    System.out.println("-----------------------------------------");
                });
        //2 + 1 ev arama filtresi

        System.out.println("2 + 1 ev filtreleme sonucu");
        houseService.getAllHousesByNormalRoomCountAndLivingRoomCount(2, 1)
                .forEach(house -> {
                    System.out.printf(house.toString());
                    house.getRooms().forEach(System.out::println);
                    System.out.println("-----------------------------------------");
                });
    }
}