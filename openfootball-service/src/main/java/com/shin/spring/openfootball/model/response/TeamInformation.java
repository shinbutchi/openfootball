package com.shin.spring.openfootball.model.response;

import java.io.Serializable;

/**
 * Created by shin on 9/11/2015.
 */
public class TeamInformation implements Serializable {

    private static final long serialVersionUID = -5967797915628504705L;
    String title;
    String key;
    int countryId;
    int club;
    private Integer assocId;
    private int national;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public Integer getAssocId() {
        return assocId;
    }

    public void setAssocId(Integer assocId) {
        this.assocId = assocId;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
    }
}
