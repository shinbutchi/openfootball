package com.shin.spring.openfootball.dao.entity;

public class Rounds {
    private int id;
    private int eventId;
    private String title;
    private String title2;
    private int pos;
    private int knockout;
    private String startAt;
    private String endAt;
    private int auto;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getKnockout() {
        return knockout;
    }

    public void setKnockout(int knockout) {
        this.knockout = knockout;
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

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
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

        Rounds rounds = (Rounds) o;

        if (id != rounds.id) return false;
        if (eventId != rounds.eventId) return false;
        if (pos != rounds.pos) return false;
        if (knockout != rounds.knockout) return false;
        if (auto != rounds.auto) return false;
        if (title != null ? !title.equals(rounds.title) : rounds.title != null) return false;
        if (title2 != null ? !title2.equals(rounds.title2) : rounds.title2 != null) return false;
        if (startAt != null ? !startAt.equals(rounds.startAt) : rounds.startAt != null) return false;
        if (endAt != null ? !endAt.equals(rounds.endAt) : rounds.endAt != null) return false;
        if (createdAt != null ? !createdAt.equals(rounds.createdAt) : rounds.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(rounds.updatedAt) : rounds.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + eventId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (title2 != null ? title2.hashCode() : 0);
        result = 31 * result + pos;
        result = 31 * result + knockout;
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + auto;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
