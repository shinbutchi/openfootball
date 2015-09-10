package com.shin.spring.openfootball.dao.entity;

public class Metros {
    private int id;
    private String name;
    private String key;
    private int placeId;
    private String code;
    private String altNames;
    private int countryId;
    private Integer pop;
    private Integer area;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
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

        Metros metros = (Metros) o;

        if (id != metros.id) return false;
        if (placeId != metros.placeId) return false;
        if (countryId != metros.countryId) return false;
        if (name != null ? !name.equals(metros.name) : metros.name != null) return false;
        if (key != null ? !key.equals(metros.key) : metros.key != null) return false;
        if (code != null ? !code.equals(metros.code) : metros.code != null) return false;
        if (altNames != null ? !altNames.equals(metros.altNames) : metros.altNames != null) return false;
        if (pop != null ? !pop.equals(metros.pop) : metros.pop != null) return false;
        if (area != null ? !area.equals(metros.area) : metros.area != null) return false;
        if (createdAt != null ? !createdAt.equals(metros.createdAt) : metros.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(metros.updatedAt) : metros.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + placeId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (altNames != null ? altNames.hashCode() : 0);
        result = 31 * result + countryId;
        result = 31 * result + (pop != null ? pop.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
