package com.shin.spring.openfootball.dao.entity;

public class Goals {
    private int id;
    private int personId;
    private int gameId;
    private int teamId;
    private Integer minute;
    private int offset;
    private Integer score1;
    private Integer score2;
    private int penalty;
    private int owngoal;
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

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getOwngoal() {
        return owngoal;
    }

    public void setOwngoal(int owngoal) {
        this.owngoal = owngoal;
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

        Goals goals = (Goals) o;

        if (id != goals.id) return false;
        if (personId != goals.personId) return false;
        if (gameId != goals.gameId) return false;
        if (teamId != goals.teamId) return false;
        if (offset != goals.offset) return false;
        if (penalty != goals.penalty) return false;
        if (owngoal != goals.owngoal) return false;
        if (minute != null ? !minute.equals(goals.minute) : goals.minute != null) return false;
        if (score1 != null ? !score1.equals(goals.score1) : goals.score1 != null) return false;
        if (score2 != null ? !score2.equals(goals.score2) : goals.score2 != null) return false;
        if (createdAt != null ? !createdAt.equals(goals.createdAt) : goals.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(goals.updatedAt) : goals.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + personId;
        result = 31 * result + gameId;
        result = 31 * result + teamId;
        result = 31 * result + (minute != null ? minute.hashCode() : 0);
        result = 31 * result + offset;
        result = 31 * result + (score1 != null ? score1.hashCode() : 0);
        result = 31 * result + (score2 != null ? score2.hashCode() : 0);
        result = 31 * result + penalty;
        result = 31 * result + owngoal;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
