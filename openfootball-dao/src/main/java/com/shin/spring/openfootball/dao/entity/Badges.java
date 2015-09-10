package com.shin.spring.openfootball.dao.entity;

public class Badges {
    private int id;
    private int teamId;
    private int leagueId;
    private int seasonId;
    private String title;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        Badges badges = (Badges) o;

        if (id != badges.id) return false;
        if (teamId != badges.teamId) return false;
        if (leagueId != badges.leagueId) return false;
        if (seasonId != badges.seasonId) return false;
        if (title != null ? !title.equals(badges.title) : badges.title != null) return false;
        if (createdAt != null ? !createdAt.equals(badges.createdAt) : badges.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(badges.updatedAt) : badges.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + teamId;
        result = 31 * result + leagueId;
        result = 31 * result + seasonId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
