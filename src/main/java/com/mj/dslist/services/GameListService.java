package com.mj.dslist.services;

import com.mj.dslist.dto.GameListDTO;
import com.mj.dslist.entities.GameList;
import com.mj.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This service class will contain methods to handle business logic related to games
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        // Fetch all games from the repository and convert them to GameMinDTO
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
