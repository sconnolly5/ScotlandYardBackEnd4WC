package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.Colour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColourRepository extends CrudRepository<Colour, Long> {

}
