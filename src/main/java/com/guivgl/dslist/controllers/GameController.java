package com.guivgl.dslist.controllers;

import com.guivgl.dslist.dto.GameDTO;
import com.guivgl.dslist.dto.GameMinDTO;
import com.guivgl.dslist.entities.Game;
import com.guivgl.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Integer id) {
        return gameService.findById(id);
    }
}
