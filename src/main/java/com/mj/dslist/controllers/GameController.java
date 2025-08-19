package com.mj.dslist.controllers;

import com.mj.dslist.dto.GameMinDTO;
import com.mj.dslist.entities.Game;
import com.mj.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    // This controller will handle requests related to games
    @GetMapping
     public List<GameMinDTO> findAll() {
        // Fetch all games from the service
        List<GameMinDTO> result = gameService.findAll();
        return result;
     }
}
