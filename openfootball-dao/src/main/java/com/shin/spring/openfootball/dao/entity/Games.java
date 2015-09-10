package com.shin.spring.openfootball.dao.entity;

public class Games {
    private int id;
    private String key;
    private int roundId;
    private int pos;
    private Integer groupId;
    private int team1Id;
    private int team2Id;
    private String playAt;
    private int postponed;
    private String playAtV2;
    private String playAtV3;
    private Integer groundId;
    private Integer cityId;
    private int knockout;
    private int home;
    private Integer score1;
    private Integer score2;
    private Integer score1Et;
    private Integer score2Et;
    private Integer score1P;
    private Integer score2P;
    private Integer score1I;
    private Integer score2I;
    private Integer score1Ii;
    private Integer score2Ii;
    private Integer nextGameId;
    private Integer prevGameId;
    private Integer winner;
    private Integer winner90;
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

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(int team2Id) {
        this.team2Id = team2Id;
    }

    public String getPlayAt() {
        return playAt;
    }

    public void setPlayAt(String playAt) {
        this.playAt = playAt;
    }

    public int getPostponed() {
        return postponed;
    }

    public void setPostponed(int postponed) {
        this.postponed = postponed;
    }

    public String getPlayAtV2() {
        return playAtV2;
    }

    public void setPlayAtV2(String playAtV2) {
        this.playAtV2 = playAtV2;
    }

    public String getPlayAtV3() {
        return playAtV3;
    }

    public void setPlayAtV3(String playAtV3) {
        this.playAtV3 = playAtV3;
    }

    public Integer getGroundId() {
        return groundId;
    }

    public void setGroundId(Integer groundId) {
        this.groundId = groundId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public int getKnockout() {
        return knockout;
    }

    public void setKnockout(int knockout) {
        this.knockout = knockout;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
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

    public Integer getScore1Et() {
        return score1Et;
    }

    public void setScore1Et(Integer score1Et) {
        this.score1Et = score1Et;
    }

    public Integer getScore2Et() {
        return score2Et;
    }

    public void setScore2Et(Integer score2Et) {
        this.score2Et = score2Et;
    }

    public Integer getScore1P() {
        return score1P;
    }

    public void setScore1P(Integer score1P) {
        this.score1P = score1P;
    }

    public Integer getScore2P() {
        return score2P;
    }

    public void setScore2P(Integer score2P) {
        this.score2P = score2P;
    }

    public Integer getScore1I() {
        return score1I;
    }

    public void setScore1I(Integer score1I) {
        this.score1I = score1I;
    }

    public Integer getScore2I() {
        return score2I;
    }

    public void setScore2I(Integer score2I) {
        this.score2I = score2I;
    }

    public Integer getScore1Ii() {
        return score1Ii;
    }

    public void setScore1Ii(Integer score1Ii) {
        this.score1Ii = score1Ii;
    }

    public Integer getScore2Ii() {
        return score2Ii;
    }

    public void setScore2Ii(Integer score2Ii) {
        this.score2Ii = score2Ii;
    }

    public Integer getNextGameId() {
        return nextGameId;
    }

    public void setNextGameId(Integer nextGameId) {
        this.nextGameId = nextGameId;
    }

    public Integer getPrevGameId() {
        return prevGameId;
    }

    public void setPrevGameId(Integer prevGameId) {
        this.prevGameId = prevGameId;
    }

    public Integer getWinner() {
        return winner;
    }

    public void setWinner(Integer winner) {
        this.winner = winner;
    }

    public Integer getWinner90() {
        return winner90;
    }

    public void setWinner90(Integer winner90) {
        this.winner90 = winner90;
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

        Games games = (Games) o;

        if (id != games.id) return false;
        if (roundId != games.roundId) return false;
        if (pos != games.pos) return false;
        if (team1Id != games.team1Id) return false;
        if (team2Id != games.team2Id) return false;
        if (postponed != games.postponed) return false;
        if (knockout != games.knockout) return false;
        if (home != games.home) return false;
        if (key != null ? !key.equals(games.key) : games.key != null) return false;
        if (groupId != null ? !groupId.equals(games.groupId) : games.groupId != null) return false;
        if (playAt != null ? !playAt.equals(games.playAt) : games.playAt != null) return false;
        if (playAtV2 != null ? !playAtV2.equals(games.playAtV2) : games.playAtV2 != null) return false;
        if (playAtV3 != null ? !playAtV3.equals(games.playAtV3) : games.playAtV3 != null) return false;
        if (groundId != null ? !groundId.equals(games.groundId) : games.groundId != null) return false;
        if (cityId != null ? !cityId.equals(games.cityId) : games.cityId != null) return false;
        if (score1 != null ? !score1.equals(games.score1) : games.score1 != null) return false;
        if (score2 != null ? !score2.equals(games.score2) : games.score2 != null) return false;
        if (score1Et != null ? !score1Et.equals(games.score1Et) : games.score1Et != null) return false;
        if (score2Et != null ? !score2Et.equals(games.score2Et) : games.score2Et != null) return false;
        if (score1P != null ? !score1P.equals(games.score1P) : games.score1P != null) return false;
        if (score2P != null ? !score2P.equals(games.score2P) : games.score2P != null) return false;
        if (score1I != null ? !score1I.equals(games.score1I) : games.score1I != null) return false;
        if (score2I != null ? !score2I.equals(games.score2I) : games.score2I != null) return false;
        if (score1Ii != null ? !score1Ii.equals(games.score1Ii) : games.score1Ii != null) return false;
        if (score2Ii != null ? !score2Ii.equals(games.score2Ii) : games.score2Ii != null) return false;
        if (nextGameId != null ? !nextGameId.equals(games.nextGameId) : games.nextGameId != null) return false;
        if (prevGameId != null ? !prevGameId.equals(games.prevGameId) : games.prevGameId != null) return false;
        if (winner != null ? !winner.equals(games.winner) : games.winner != null) return false;
        if (winner90 != null ? !winner90.equals(games.winner90) : games.winner90 != null) return false;
        if (createdAt != null ? !createdAt.equals(games.createdAt) : games.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(games.updatedAt) : games.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + roundId;
        result = 31 * result + pos;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + team1Id;
        result = 31 * result + team2Id;
        result = 31 * result + (playAt != null ? playAt.hashCode() : 0);
        result = 31 * result + postponed;
        result = 31 * result + (playAtV2 != null ? playAtV2.hashCode() : 0);
        result = 31 * result + (playAtV3 != null ? playAtV3.hashCode() : 0);
        result = 31 * result + (groundId != null ? groundId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + knockout;
        result = 31 * result + home;
        result = 31 * result + (score1 != null ? score1.hashCode() : 0);
        result = 31 * result + (score2 != null ? score2.hashCode() : 0);
        result = 31 * result + (score1Et != null ? score1Et.hashCode() : 0);
        result = 31 * result + (score2Et != null ? score2Et.hashCode() : 0);
        result = 31 * result + (score1P != null ? score1P.hashCode() : 0);
        result = 31 * result + (score2P != null ? score2P.hashCode() : 0);
        result = 31 * result + (score1I != null ? score1I.hashCode() : 0);
        result = 31 * result + (score2I != null ? score2I.hashCode() : 0);
        result = 31 * result + (score1Ii != null ? score1Ii.hashCode() : 0);
        result = 31 * result + (score2Ii != null ? score2Ii.hashCode() : 0);
        result = 31 * result + (nextGameId != null ? nextGameId.hashCode() : 0);
        result = 31 * result + (prevGameId != null ? prevGameId.hashCode() : 0);
        result = 31 * result + (winner != null ? winner.hashCode() : 0);
        result = 31 * result + (winner90 != null ? winner90.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
