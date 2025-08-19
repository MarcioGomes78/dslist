package com.mj.dslist.services;

import com.mj.dslist.dto.GameMinDTO;
import com.mj.dslist.entities.Game;
import com.mj.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// This service class will contain methods to handle business logic related to games
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        // Fetch all games from the repository and convert them to GameMinDTO
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
