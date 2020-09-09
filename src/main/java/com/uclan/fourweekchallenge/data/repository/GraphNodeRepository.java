package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.GraphNode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphNodeRepository extends CrudRepository<GraphNode, Long> {
}
