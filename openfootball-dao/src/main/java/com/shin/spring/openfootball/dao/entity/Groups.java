package com.shin.spring.openfootball.dao.entity;

public class Groups {
    private int id;
    private int eventId;
    private String title;
    private int pos;
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

        Groups groups = (Groups) o;

        if (id != groups.id) return false;
        if (eventId != groups.eventId) return false;
        if (pos != groups.pos) return false;
        if (title != null ? !title.equals(groups.title) : groups.title != null) return false;
        if (createdAt != null ? !createdAt.equals(groups.createdAt) : groups.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(groups.updatedAt) : groups.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + eventId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + pos;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
