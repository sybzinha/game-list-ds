package com.sybdev.gamelist.services;


import java.util.List;

import com.sybdev.gamelist.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sybdev.gamelist.dto.GameMinDTO;
import com.sybdev.gamelist.entities.Game;
import com.sybdev.gamelist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}

