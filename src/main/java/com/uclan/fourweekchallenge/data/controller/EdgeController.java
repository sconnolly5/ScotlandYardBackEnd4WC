package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Edge;
import com.uclan.fourweekchallenge.data.repository.EdgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edges")
public class EdgeController {
    @Autowired
    private EdgeRepository edgeRepository;

    @GetMapping
    public Iterable<Edge> getEdges() {
        return this.edgeRepository.findAll();
    }
}