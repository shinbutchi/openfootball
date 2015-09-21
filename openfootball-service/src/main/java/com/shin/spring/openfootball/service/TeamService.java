package com.shin.spring.openfootball.service;

import com.shin.spring.openfootball.model.response.TeamInformationResponse;
import com.shin.spring.openfootball.model.response.TeamListResponse;

/**
 * Created by shin on 9/11/2015.
 */
public interface TeamService {
    TeamInformationResponse getClubInformation(int teamId);
    TeamListResponse getAllTeamsInCountry(int countryId);
}
