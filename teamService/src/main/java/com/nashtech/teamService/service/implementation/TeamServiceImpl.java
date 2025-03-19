package com.nashtech.teamService.service.implementation;

import com.nashtech.teamService.entities.Team;
import com.nashtech.teamService.repository.TeamRepository;
import com.nashtech.teamService.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    private TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team create(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team getOne(Long teamId) {
        return teamRepository.findById(teamId).orElseThrow(()-> new RuntimeException("Team not found."));
    }

    @Override
    public List<Team> getAll() {
        return teamRepository.findAll();
    }
}


