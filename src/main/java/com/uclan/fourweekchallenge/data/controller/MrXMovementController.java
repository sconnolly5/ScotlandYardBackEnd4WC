package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.MrXMovement;
import com.uclan.fourweekchallenge.data.repository.MrXMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MrXMovement")
public class MrXMovementController {
    @Autowired
    private MrXMovementRepository mrXMovementRepository;

    @GetMapping
    public Iterable<MrXMovement> getMrXMovements() {
        return this.mrXMovementRepository.findAll();
    }
}
