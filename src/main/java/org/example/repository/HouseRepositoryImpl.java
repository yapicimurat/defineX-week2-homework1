package org.example.repository;

import org.example.model.HouseType;
import org.example.model.abst.House;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseRepositoryImpl implements HouseRepository{
    private List<House> houses = new ArrayList<>();

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
