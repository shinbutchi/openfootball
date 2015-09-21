package com.shin.spring.openfootball.model.request;

import java.io.Serializable;

public class GetTeamInformationRequest implements Serializable {
    private static final long serialVersionUID = -6259802567768970502L;
    private int teamId;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
