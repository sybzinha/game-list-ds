package com.sybdev.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sybdev.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

