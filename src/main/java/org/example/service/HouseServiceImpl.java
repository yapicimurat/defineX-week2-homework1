package org.example.service;

import org.example.model.HouseType;
import org.example.model.RoomType;
import org.example.model.abst.House;
import org.example.repository.HouseRepository;
import java.util.List;
import java.util.stream.Collectors;

public class HouseServiceImpl implements HouseService{
    private final HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<House> getAll() {
        return houseRepository.getAll();
    }

    @Override
    public double totalPriceOfNormalHouses() {
        return getTotalPriceByHouseType(HouseType.NORMAL);
    }

    @Override
    public double totalPriceOfVillaHouses() {
        return getTotalPriceByHouseType(HouseType.VILLA);
    }

    @Override
    public double totalPriceOfSummerHouses() {
        return getTotalPriceByHouseType(HouseType.SUMMER_HOUSE);
    }

    @Override
    public double totalPriceOfEveryTypesOfHouses() {
        return getTotalPriceAllHouses();
    }

    @Override
    public double averageAreaInSquareMeterOfNormalHouses() {
        return getAverageAreaInSquareMeterByHouseType(HouseType.NORMAL);
    }

    @Override
    public double averageAreaInSquareMeterOfVillaHouses() {
        return getAverageAreaInSquareMeterByHouseType(HouseType.VILLA);
    }

    @Override
    public double averageAreaInSquareMeterOfSummerHouses() {
        return getAverageAreaInSquareMeterByHouseType(HouseType.SUMMER_HOUSE);
    }

    @Override
    public double averageAreaInSquareMeterOfEveryTypesOfHouses() {
        return getAverageAreaInSquareMeterAllHouses();
    }

    @Override
    public List<House> getAllHousesByNormalRoomCountAndLivingRoomCount(int normalRoomCount, int livingRoomCount) {
        return houseRepository.getAll().stream()
                .filter(house -> house.getRoomCountByRoomType(RoomType.NORMAL) == normalRoomCount
                                && house.getRoomCountByRoomType(RoomType.LIVING_ROOM) == livingRoomCount)
                .collect(Collectors.toList());
    }

    @Override
    public void createHouse(House house) {
        houseRepository.save(house);
    }

    private Double getTotalPriceByHouseType(HouseType houseType){
        return houseRepository.getAllByHouseType(houseType)
                .stream().mapToDouble(House::getPrice)
                .sum();
    }

    private double getTotalPriceAllHouses(){
        return houseRepository.getAll()
                .stream().map(House::getPrice)
                .reduce(0.0, Double::sum);
    }

    private double getAverageAreaInSquareMeterByHouseType(HouseType houseType){
            return houseRepository.getAllByHouseType(houseType)
                .stream().mapToDouble(House::getVolumeInSquareMeter)
                .average().orElse(0.0);
    }

    private double getAverageAreaInSquareMeterAllHouses(){
        return houseRepository.getAll()
                .stream().mapToDouble(House::getVolumeInSquareMeter)
                .average().orElse(0.0);
    }

}
