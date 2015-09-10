package com.shin.spring.openfootball.dao.entity;

public class EventStandingEntries {
    private int id;
    private int eventStandingId;
    private int teamId;
    private Integer pos;
    private Integer played;
    private Integer won;
    private Integer lost;
    private Integer drawn;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer pts;
    private String comments;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventStandingId() {
        return eventStandingId;
    }

    public void setEventStandingId(int eventStandingId) {
        this.eventStandingId = eventStandingId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getDrawn() {
        return drawn;
    }

    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

        EventStandingEntries that = (EventStandingEntries) o;

        if (id != that.id) return false;
        if (eventStandingId != that.eventStandingId) return false;
        if (teamId != that.teamId) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;
        if (played != null ? !played.equals(that.played) : that.played != null) return false;
        if (won != null ? !won.equals(that.won) : that.won != null) return false;
        if (lost != null ? !lost.equals(that.lost) : that.lost != null) return false;
        if (drawn != null ? !drawn.equals(that.drawn) : that.drawn != null) return false;
        if (goalsFor != null ? !goalsFor.equals(that.goalsFor) : that.goalsFor != null) return false;
        if (goalsAgainst != null ? !goalsAgainst.equals(that.goalsAgainst) : that.goalsAgainst != null) return false;
        if (pts != null ? !pts.equals(that.pts) : that.pts != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + eventStandingId;
        result = 31 * result + teamId;
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        result = 31 * result + (played != null ? played.hashCode() : 0);
        result = 31 * result + (won != null ? won.hashCode() : 0);
        result = 31 * result + (lost != null ? lost.hashCode() : 0);
        result = 31 * result + (drawn != null ? drawn.hashCode() : 0);
        result = 31 * result + (goalsFor != null ? goalsFor.hashCode() : 0);
        result = 31 * result + (goalsAgainst != null ? goalsAgainst.hashCode() : 0);
        result = 31 * result + (pts != null ? pts.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
