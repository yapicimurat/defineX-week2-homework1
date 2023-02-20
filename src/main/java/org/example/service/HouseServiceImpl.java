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
    public Double totalPriceOfNormalHouses() {
        return getTotalPriceByHouseType(HouseType.NORMAL);
    }

    @Override
    public Double totalPriceOfVillaHouses() {
        return getTotalPriceByHouseType(HouseType.VILLA);
    }

    @Override
    public Double totalPriceOfSummerHouses() {
        return getTotalPriceByHouseType(HouseType.SUMMER_HOUSE);
    }

    @Override
    public Double totalPriceOfEveryTypesOfHouses() {
        return getTotalPriceAllHouses();
    }

    @Override
    public Double averageVolumeInSquareMeterOfNormalHouses() {
        return getAverageVolumeInSquareMeterByHouseType(HouseType.NORMAL);
    }

    @Override
    public Double averageVolumeInSquareMeterOfVillaHouses() {
        return getAverageVolumeInSquareMeterByHouseType(HouseType.VILLA);
    }

    @Override
    public Double averageVolumeInSquareMeterOfSummerHouses() {
        return getAverageVolumeInSquareMeterByHouseType(HouseType.SUMMER_HOUSE);
    }

    @Override
    public Double averageVolumeInSquareMeterOfEveryTypesOfHouses() {
        return getAverageVolumeInSquareMeterAllHouses();
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
                .stream().map(House::getPrice)
                .reduce(0.0, Double::sum);
    }

    private Double getTotalPriceAllHouses(){
        return houseRepository.getAll()
                .stream().map(House::getPrice)
                .reduce(0.0, Double::sum);
    }

    private Double getAverageVolumeInSquareMeterByHouseType(HouseType houseType){
        return houseRepository.getAllByHouseType(houseType)
                .stream().map(House::getVolumeInSquareMeter)
                .reduce(0.0, Double::sum);
    }

    private Double getAverageVolumeInSquareMeterAllHouses(){
        return houseRepository.getAll()
                .stream().map(House::getVolumeInSquareMeter)
                .reduce(0.0, Double::sum);
    }

}
