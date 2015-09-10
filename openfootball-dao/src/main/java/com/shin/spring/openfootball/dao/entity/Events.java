package com.shin.spring.openfootball.dao.entity;

public class Events {
    private int id;
    private String key;
    private int leagueId;
    private int seasonId;
    private String startAt;
    private String endAt;
    private int team3;
    private String sources;
    private String config;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public int getTeam3() {
        return team3;
    }

    public void setTeam3(int team3) {
        this.team3 = team3;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Events events = (Events) o;

        if (id != events.id) return false;
        if (leagueId != events.leagueId) return false;
        if (seasonId != events.seasonId) return false;
        if (team3 != events.team3) return false;
        if (key != null ? !key.equals(events.key) : events.key != null) return false;
        if (startAt != null ? !startAt.equals(events.startAt) : events.startAt != null) return false;
        if (endAt != null ? !endAt.equals(events.endAt) : events.endAt != null) return false;
        if (sources != null ? !sources.equals(events.sources) : events.sources != null) return false;
        if (config != null ? !config.equals(events.config) : events.config != null) return false;
        if (createdAt != null ? !createdAt.equals(events.createdAt) : events.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(events.updatedAt) : events.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + leagueId;
        result = 31 * result + seasonId;
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + team3;
        result = 31 * result + (sources != null ? sources.hashCode() : 0);
        result = 31 * result + (config != null ? config.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
