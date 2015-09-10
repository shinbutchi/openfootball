package com.shin.spring.openfootball.dao.entity;

public class Grounds {
    private int id;
    private String key;
    private String title;
    private String synonyms;
    private int countryId;
    private Integer cityId;
    private Integer since;
    private Integer capacity;
    private String address;
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

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getSince() {
        return since;
    }

    public void setSince(Integer since) {
        this.since = since;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

        Grounds grounds = (Grounds) o;

        if (id != grounds.id) return false;
        if (countryId != grounds.countryId) return false;
        if (key != null ? !key.equals(grounds.key) : grounds.key != null) return false;
        if (title != null ? !title.equals(grounds.title) : grounds.title != null) return false;
        if (synonyms != null ? !synonyms.equals(grounds.synonyms) : grounds.synonyms != null) return false;
        if (cityId != null ? !cityId.equals(grounds.cityId) : grounds.cityId != null) return false;
        if (since != null ? !since.equals(grounds.since) : grounds.since != null) return false;
        if (capacity != null ? !capacity.equals(grounds.capacity) : grounds.capacity != null) return false;
        if (address != null ? !address.equals(grounds.address) : grounds.address != null) return false;
        if (createdAt != null ? !createdAt.equals(grounds.createdAt) : grounds.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(grounds.updatedAt) : grounds.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (synonyms != null ? synonyms.hashCode() : 0);
        result = 31 * result + countryId;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (since != null ? since.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
