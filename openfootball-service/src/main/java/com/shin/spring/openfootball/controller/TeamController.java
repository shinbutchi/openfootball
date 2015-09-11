package com.shin.spring.openfootball.controller;

import com.shin.spring.openfootball.model.request.TeamInformationRequest;
import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/getTeamInfo", method = RequestMethod.POST)
    @ResponseBody
    public TeamInformationResponse getTeamInformation(@RequestBody TeamInformationRequest teamInformationRequest) {
        return teamService.getClubInformation(teamInformationRequest.getTeamId());
    }
}
