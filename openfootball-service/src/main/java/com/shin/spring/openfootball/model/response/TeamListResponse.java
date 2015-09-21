package com.shin.spring.openfootball.model.response;

import java.util.List;

/**
 * Created by shin on 9/11/2015.
 */
public class TeamListResponse extends ApiResponse<List<TeamInformation>> {
    public TeamListResponse(List<TeamInformation> teamList) {
        super(teamList);
    }
}
