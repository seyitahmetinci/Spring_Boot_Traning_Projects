package com.ahmetinci.locationweb.service;

import com.ahmetinci.locationweb.dto.SaveEmployeeDTO;
import com.ahmetinci.locationweb.entities.Location;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ahmetinci.locationweb.repository.LocationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService{

    private final LocationRepository repository;

    @Override
    public Location saveLocation(SaveEmployeeDTO location) {
        Location save = null;
        if(location.getId() == null)
        {
            Location loc = new Location();
            loc.setCode(location.getCode());
            loc.setName(location.getName());
             save = repository.save(loc);

        }else{



        }

        return save;

    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public void deleteLocaiton(Location location) {

    }

    @Override
    public Location getLocationById(int id) {
        return null;
    }

    @Override
    public List<Location> getAllLocations() {
        List<Location> all = repository.findAll();
        return all;
    }

    @Override
    public int updateLocation(String insert_query, long id, String code, String name, String type) {
        return 0;
    }
}
