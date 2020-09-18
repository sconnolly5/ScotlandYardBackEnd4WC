package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
    Game findByGameId(long id);
}
