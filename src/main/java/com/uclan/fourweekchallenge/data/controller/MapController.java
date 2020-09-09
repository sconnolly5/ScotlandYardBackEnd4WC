package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Map;
import com.uclan.fourweekchallenge.data.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapController {
    @Autowired
    private MapRepository mapRepository;

    @GetMapping
    public Iterable<Map> getMaps() {
        return this.mapRepository.findAll();
    }
}