package com.shin.spring.openfootball.activator;

import com.shin.spring.openfootball.model.request.GetAllTeamsOfCountryRequest;
import com.shin.spring.openfootball.model.request.GetTeamInformationRequest;
import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.model.response.TeamListResponse;
import com.shin.spring.openfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by shin on 9/11/2015.
 */

@Component
public class TeamManagementActivator {
    @Autowired
    private TeamService teamService;

    public Message<TeamInformationResponse> getTeamInformation(GetTeamInformationRequest getTeamInformationRequest) {
        TeamInformationResponse teamInformationResponse = teamService.getClubInformation(getTeamInformationRequest.getTeamId());
        return MessageBuilder.withPayload(teamInformationResponse).build();
    }

    public Message<TeamListResponse> getAllTeamsOfCountry(GetAllTeamsOfCountryRequest getAllTeamsOfCountryRequest) {
        TeamListResponse teamListResponse = teamService.getAllTeamsInCountry(getAllTeamsOfCountryRequest.getCountryId());
        return MessageBuilder.withPayload(teamListResponse).build();
    }
}
