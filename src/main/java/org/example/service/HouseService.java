package org.example.service;

import org.example.model.abst.House;
import java.math.BigDecimal;
import java.util.List;

public interface HouseService {
    public List<House> getAll();
    public double totalPriceOfNormalHouses();
    public double totalPriceOfVillaHouses();
    public double totalPriceOfSummerHouses();
    public double totalPriceOfEveryTypesOfHouses();
    public double averageAreaInSquareMeterOfNormalHouses();
    public double averageAreaInSquareMeterOfVillaHouses();
    public double averageAreaInSquareMeterOfSummerHouses();
    public double averageAreaInSquareMeterOfEveryTypesOfHouses();
    public List<House> getAllHousesByNormalRoomCountAndLivingRoomCount(int normalRoomCount, int livingRoomAmount);
    public void createHouse(House house);
}
