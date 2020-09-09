package com.uclan.fourweekchallenge.data.repository;

import com.uclan.fourweekchallenge.data.entity.Lobby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LobbyRepository extends CrudRepository<Lobby, Long> {

}
