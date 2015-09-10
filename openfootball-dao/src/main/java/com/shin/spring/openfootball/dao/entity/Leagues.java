package com.shin.spring.openfootball.dao.entity;

public class Leagues {
    private int id;
    private String key;
    private String title;
    private Integer countryId;
    private int club;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
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

        Leagues leagues = (Leagues) o;

        if (id != leagues.id) return false;
        if (club != leagues.club) return false;
        if (key != null ? !key.equals(leagues.key) : leagues.key != null) return false;
        if (title != null ? !title.equals(leagues.title) : leagues.title != null) return false;
        if (countryId != null ? !countryId.equals(leagues.countryId) : leagues.countryId != null) return false;
        if (createdAt != null ? !createdAt.equals(leagues.createdAt) : leagues.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(leagues.updatedAt) : leagues.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + club;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
