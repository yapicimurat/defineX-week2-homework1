package org.example.service;

import org.example.model.abst.House;
import java.math.BigDecimal;
import java.util.List;

public interface HouseService {
    public List<House> getAll();
    public Double totalPriceOfNormalHouses();
    public Double totalPriceOfVillaHouses();
    public Double totalPriceOfSummerHouses();
    public Double totalPriceOfEveryTypesOfHouses();
    public Double averageVolumeInSquareMeterOfNormalHouses();
    public Double averageVolumeInSquareMeterOfVillaHouses();
    public Double averageVolumeInSquareMeterOfSummerHouses();
    public Double averageVolumeInSquareMeterOfEveryTypesOfHouses();
    public List<House> getAllHousesByNormalRoomCountAndLivingRoomCount(int normalRoomCount, int livingRoomAmount);
    public void createHouse(House house);
}
