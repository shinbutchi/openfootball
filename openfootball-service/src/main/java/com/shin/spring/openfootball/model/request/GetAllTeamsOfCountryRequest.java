package com.shin.spring.openfootball.model.request;

import java.io.Serializable;

public class GetAllTeamsOfCountryRequest implements Serializable {
    private static final long serialVersionUID = 1988183785280811876L;
    private int countryId;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
