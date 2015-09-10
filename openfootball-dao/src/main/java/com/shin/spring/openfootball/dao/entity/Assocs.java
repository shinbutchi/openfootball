package com.shin.spring.openfootball.dao.entity;

public class Assocs {
    private int id;
    private String key;
    private String title;
    private Integer since;
    private String web;
    private Integer countryId;
    private int national;
    private int continental;
    private int intercontinental;
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

    public Integer getSince() {
        return since;
    }

    public void setSince(Integer since) {
        this.since = since;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
    }

    public int getContinental() {
        return continental;
    }

    public void setContinental(int continental) {
        this.continental = continental;
    }

    public int getIntercontinental() {
        return intercontinental;
    }

    public void setIntercontinental(int intercontinental) {
        this.intercontinental = intercontinental;
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

        Assocs assocs = (Assocs) o;

        if (id != assocs.id) return false;
        if (national != assocs.national) return false;
        if (continental != assocs.continental) return false;
        if (intercontinental != assocs.intercontinental) return false;
        if (key != null ? !key.equals(assocs.key) : assocs.key != null) return false;
        if (title != null ? !title.equals(assocs.title) : assocs.title != null) return false;
        if (since != null ? !since.equals(assocs.since) : assocs.since != null) return false;
        if (web != null ? !web.equals(assocs.web) : assocs.web != null) return false;
        if (countryId != null ? !countryId.equals(assocs.countryId) : assocs.countryId != null) return false;
        if (createdAt != null ? !createdAt.equals(assocs.createdAt) : assocs.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(assocs.updatedAt) : assocs.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (since != null ? since.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + national;
        result = 31 * result + continental;
        result = 31 * result + intercontinental;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
