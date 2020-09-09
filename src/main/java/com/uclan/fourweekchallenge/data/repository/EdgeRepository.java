package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.Edge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdgeRepository extends CrudRepository<Edge, Long> {
}
