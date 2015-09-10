package com.shin.spring.openfootball.dao.entity;

public class Rosters {
    private int id;
    private int personId;
    private int teamId;
    private Integer eventId;
    private int pos;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
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

        Rosters rosters = (Rosters) o;

        if (id != rosters.id) return false;
        if (personId != rosters.personId) return false;
        if (teamId != rosters.teamId) return false;
        if (pos != rosters.pos) return false;
        if (eventId != null ? !eventId.equals(rosters.eventId) : rosters.eventId != null) return false;
        if (createdAt != null ? !createdAt.equals(rosters.createdAt) : rosters.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(rosters.updatedAt) : rosters.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + personId;
        result = 31 * result + teamId;
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        result = 31 * result + pos;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
