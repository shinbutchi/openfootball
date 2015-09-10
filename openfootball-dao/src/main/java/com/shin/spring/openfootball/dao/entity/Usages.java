package com.shin.spring.openfootball.dao.entity;

public class Usages {
    private int id;
    private int countryId;
    private int langId;
    private int official;
    private int minor;
    private Double percent;
    private String createdAt;
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    public int getOfficial() {
        return official;
    }

    public void setOfficial(int official) {
        this.official = official;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
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

        Usages usages = (Usages) o;

        if (id != usages.id) return false;
        if (countryId != usages.countryId) return false;
        if (langId != usages.langId) return false;
        if (official != usages.official) return false;
        if (minor != usages.minor) return false;
        if (percent != null ? !percent.equals(usages.percent) : usages.percent != null) return false;
        if (createdAt != null ? !createdAt.equals(usages.createdAt) : usages.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(usages.updatedAt) : usages.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + countryId;
        result = 31 * result + langId;
        result = 31 * result + official;
        result = 31 * result + minor;
        result = 31 * result + (percent != null ? percent.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
