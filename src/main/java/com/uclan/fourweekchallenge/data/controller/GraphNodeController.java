package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.GraphNode;
import com.uclan.fourweekchallenge.data.repository.GraphNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/graphNodes")
public class GraphNodeController {
    @Autowired
    private GraphNodeRepository graphNodeRepository;

    @GetMapping
    public Iterable<GraphNode> getGraphNodes() {
        return this.graphNodeRepository.findAll();
    }
}
