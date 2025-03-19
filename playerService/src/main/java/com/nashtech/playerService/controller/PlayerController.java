package com.nashtech.playerService.controller;

import com.nashtech.playerService.entities.Player;
import com.nashtech.playerService.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService PlayerService) {
        this.playerService = PlayerService;
    }

    @PostMapping
    public Player create(@RequestBody Player player){
        return playerService.create(player);
    }

    @GetMapping("/{playerId}")
    public Player getOne(@PathVariable Long playerId){
        return playerService.getOne(playerId);
    }

    @GetMapping
    public List<Player> getAll(){
        return playerService.getAll();
    }

    @GetMapping("/team/{teamId}")
    public List<Player> getPlayerByTeamId(@PathVariable Long teamId){
        return playerService.getPlayerByTeamId(teamId);
    }
}

