package org.example.repository;

import org.example.model.HouseType;
import org.example.model.abst.House;

import java.util.List;

public interface HouseRepository {
    public List<House> getAllByHouseType(HouseType houseType);
    public List<House> getAll();
    public void save(House house);
}
