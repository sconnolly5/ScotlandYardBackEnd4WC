package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Colour;
import com.uclan.fourweekchallenge.data.repository.ColourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/colours")
public class ColourController {
    @Autowired
    private ColourRepository colourRepository;

    @GetMapping
    public Iterable<Colour> getColours() {
        return this.colourRepository.findAll();
    }
}
