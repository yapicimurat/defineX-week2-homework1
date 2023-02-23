package org.example;

import org.example.repository.HouseRepositoryImpl;
import org.example.service.HouseService;
import org.example.service.HouseServiceImpl;

public class Main {
    public static void main(String[] args) {

        HouseService houseService = new HouseServiceImpl(new HouseRepositoryImpl());

        System.out.println("Total price of Normal Houses: " + houseService.totalPriceOfNormalHouses());
        System.out.println("Total price of Summer Houses: " + houseService.totalPriceOfSummerHouses());
        System.out.println("Total price of Villa Houses: " + houseService.totalPriceOfVillaHouses());
        System.out.println("Total price all of types Houses: " + houseService.totalPriceOfEveryTypesOfHouses());

        System.out.println("Average area of Normal houses: " + houseService.averageAreaInSquareMeterOfNormalHouses());
        System.out.println("Average area of Villa houses: " + houseService.averageAreaInSquareMeterOfVillaHouses());
        System.out.println("Average area of Summer houses: " + houseService.averageAreaInSquareMeterOfSummerHouses());
        System.out.println("Average area of all type houses: " + houseService.averageAreaInSquareMeterOfEveryTypesOfHouses());

        System.out.println("2 + 1 house filter result");
        houseService.getAllHousesByNormalRoomCountAndLivingRoomCount(2, 1)
        .forEach(house -> {
            System.out.printf(house.toString());
            house.getRooms().forEach(System.out::println);
            System.out.println("-----------------------------------------");
        });
    }
}