package com.ahmetinci.locationweb.service;

import com.ahmetinci.locationweb.dto.SaveEmployeeDTO;
import com.ahmetinci.locationweb.entities.Location;

import java.util.List;

public interface LocationService {

    Location location = new Location();

    Location saveLocation(SaveEmployeeDTO location);
    Location updateLocation(Location location);

    void deleteLocaiton(Location location);

    Location getLocationById(int id);

    List<Location> getAllLocations();


    int updateLocation(String insert_query, long id, String code, String name, String type);
}
