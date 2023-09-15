package com.ahmetinci.locationweb.repository;

import com.ahmetinci.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {



}
