package com.mj.dslist.controllers;

import com.mj.dslist.dto.GameListDTO;
import com.mj.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    // This controller will handle requests related to games
    @GetMapping
     public List<GameListDTO> findAll() {
        // Fetch all games from the service
        List<GameListDTO> result = gameListService.findAll();
        return result;
     }
}
