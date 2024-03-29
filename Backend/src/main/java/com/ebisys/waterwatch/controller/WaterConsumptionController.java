package com.ebisys.waterwatch.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.ebisys.waterwatch.model.WaterConsumption;
import com.ebisys.waterwatch.service.WaterConsumptionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping("/waterconsumption")
public class WaterConsumptionController {

    @Autowired
    private WaterConsumptionService waterConsumptionService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<WaterConsumption> findAll() {
        return waterConsumptionService.findAll();
    }

    @GetMapping(path = "/topten")
    public List<WaterConsumption> findTopTenConsumers() {
        return waterConsumptionService.findTopTenConsumers();
    }

    @GetMapping(path = "/geojeson")
    public List<WaterConsumption>  findGeojson() {
        return waterConsumptionService.findTopTenConsumers();
    }
}
