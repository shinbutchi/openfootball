package com.shin.spring.openfootball.activator;

import com.shin.spring.openfootball.model.request.TeamInformationRequest;
import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by shin on 9/11/2015.
 */

@Service
public class TeamManagementActivator {
    @Autowired
    private TeamService teamService;

    public Message<TeamInformationResponse> getTeamInformation(TeamInformationRequest teamInformationRequest) {
        TeamInformationResponse teamInformationResponse = teamService.getClubInformation(teamInformationRequest.getTeamId());
        return MessageBuilder.withPayload(teamInformationResponse).build();
    }
}
