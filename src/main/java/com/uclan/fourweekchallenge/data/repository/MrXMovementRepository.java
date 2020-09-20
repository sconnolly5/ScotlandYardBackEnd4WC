package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.MrXMovement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MrXMovementRepository extends CrudRepository<MrXMovement, Long> {
}
