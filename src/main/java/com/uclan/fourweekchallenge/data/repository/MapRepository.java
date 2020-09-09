package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.Map;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends CrudRepository<Map, Long> {
}
