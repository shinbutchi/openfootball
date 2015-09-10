package com.shin.spring.openfootball.dao.entity;

public class Names {
    private int id;
    private String name;
    private int placeId;
    private String placeKind;
    private String lang;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceKind() {
        return placeKind;
    }

    public void setPlaceKind(String placeKind) {
        this.placeKind = placeKind;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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

        Names names = (Names) o;

        if (id != names.id) return false;
        if (placeId != names.placeId) return false;
        if (name != null ? !name.equals(names.name) : names.name != null) return false;
        if (placeKind != null ? !placeKind.equals(names.placeKind) : names.placeKind != null) return false;
        if (lang != null ? !lang.equals(names.lang) : names.lang != null) return false;
        if (createdAt != null ? !createdAt.equals(names.createdAt) : names.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(names.updatedAt) : names.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + placeId;
        result = 31 * result + (placeKind != null ? placeKind.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
