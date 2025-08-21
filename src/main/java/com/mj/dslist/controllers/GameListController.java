package com.mj.dslist.controllers;

import com.mj.dslist.dto.GameListDTO;
import com.mj.dslist.dto.GameMinDTO;
import com.mj.dslist.services.GameListService;
import com.mj.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    // This controller will handle requests related to games
    @GetMapping
     public List<GameListDTO> findAll() {
        // Fetch all games from the service
        List<GameListDTO> result = gameListService.findAll();
        return result;
     }

    @GetMapping(value = "/{listId}/games")
     public List<GameMinDTO> findByList(@PathVariable Long listId) {
        // Fetch all games from the service by list ID
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
     }
}
