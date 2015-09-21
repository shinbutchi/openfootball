package com.shin.spring.openfootball.service.impl;

import com.shin.spring.openfootball.constant.AppConstant;
import com.shin.spring.openfootball.dao.entity.Teams;
import com.shin.spring.openfootball.dao.repository.TeamRepository;
import com.shin.spring.openfootball.model.response.TeamInformation;
import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.model.response.TeamListResponse;
import com.shin.spring.openfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shin on 9/11/2015.
 */

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    public TeamInformationResponse getClubInformation(int teamId) {
        Teams team = teamRepository.findFirstById(teamId);
        TeamInformation teamInformation = createTeamInformation(team);
        return new TeamInformationResponse(teamInformation);
    }

    public TeamListResponse getAllTeamsInCountry(int countryId) {
        List<Teams> teams = teamRepository.findByCountryIdAndClub(countryId, AppConstant.TRUE_SYMBOL);
        validateTeamListIsNotNull(teams);
        List<TeamInformation> teamInformations = createTeamListInCountry(teams);
        return new TeamListResponse(teamInformations);
    }

    private List<TeamInformation> createTeamListInCountry(List<Teams> teams) {
        List<TeamInformation> teamInformations = new ArrayList<TeamInformation>();
        for (Teams team : teams) {
            TeamInformation teamInformation = createTeamInformation(team);
            teamInformations.add(teamInformation);
        }
        return teamInformations;
    }

    private void validateTeamListIsNotNull(List<Teams> teams) {
        if (CollectionUtils.isEmpty(teams)) {
            /*TODO-shin throw exception here*/
        }
    }

    private TeamInformation createTeamInformation(Teams team) {
        TeamInformation teamInformation = new TeamInformation();
        teamInformation.setTitle(team.getTitle());
        teamInformation.setKey(team.getKey());
        teamInformation.setAssocId(team.getAssocId());
        teamInformation.setCountryId(team.getCountryId());
        return teamInformation;

    }
}
