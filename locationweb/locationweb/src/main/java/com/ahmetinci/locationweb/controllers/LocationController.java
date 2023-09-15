package com.ahmetinci.locationweb.controllers;


import com.ahmetinci.locationweb.dto.SaveEmployeeDTO;
import com.ahmetinci.locationweb.entities.Location;
import com.ahmetinci.locationweb.service.LocationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class LocationController {


    private final LocationServiceImpl locationService;


    @GetMapping("/showCreate")
    public ModelAndView showCreate() {

        List<Location> allLocations = locationService.getAllLocations();


        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("ali", allLocations);
        return mav;
    }

    @GetMapping("/showInsert")
    public ModelAndView showInsert() {

        List<Location> allLocations = locationService.getAllLocations();


        ModelAndView mav2 = new ModelAndView("showInsert");
        mav2.addObject("ali", allLocations);
        return mav2;
    }

    @PostMapping(value = "/save", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public String saveEmployee(SaveEmployeeDTO saveEmployeeDTO) {

        locationService.saveLocation(saveEmployeeDTO);
        return "redirect:/";

    }

}




