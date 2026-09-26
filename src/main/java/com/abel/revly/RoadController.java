package com.abel.revly;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roads")
public class RoadController {
    // field
    private final RoadRepository roadRepository;

    // constructor
    public RoadController(RoadRepository roadRepository) {
        this.roadRepository = roadRepository;
    }

    //End-point
    @GetMapping
    public List<Road> getAllRoads(){
        return roadRepository.findAll();
    }

    //End-point
    @PostMapping
    public Road createRoad(@RequestBody Road road ){
        return roadRepository.save(road);
    }
}
