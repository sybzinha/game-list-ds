package com.sybdev.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sybdev.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

