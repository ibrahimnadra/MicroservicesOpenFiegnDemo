package com.nashtech.teamService.service;
import com.nashtech.teamService.entities.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8080/", value = "playerClient")
public interface PlayerClient {

    @GetMapping("/player/team/{teamId}")
    List<Player> getPlayersOfTeam(@PathVariable Long teamId);
}

