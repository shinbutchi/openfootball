package com.shin.spring.openfootball.service.impl;

import com.shin.spring.openfootball.dao.entity.Teams;
import com.shin.spring.openfootball.dao.repository.TeamRepository;
import com.shin.spring.openfootball.model.response.TeamInformation;
import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shin on 9/11/2015.
 */

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    public TeamInformationResponse getClubInformation(String teamId) {
        Teams team = teamRepository.findFirstById(teamId);
        TeamInformation teamInformation = createTeamInformation(team);
        return new TeamInformationResponse(teamInformation);
    }

    private TeamInformation createTeamInformation(Teams team) {
        TeamInformation teamInformation = new TeamInformation();
        teamInformation.setTitle(team.getTitle());
        return teamInformation;

    }
}
