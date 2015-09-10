package com.shin.spring.openfootball.dao.entity;

public class Cities {
    private int id;
    private String name;
    private String key;
    private int placeId;
    private String code;
    private String altNames;
    private int countryId;
    private Integer stateId;
    private Integer partId;
    private Integer countyId;
    private Integer muniId;
    private Integer metroId;
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

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getMuniId() {
        return muniId;
    }

    public void setMuniId(Integer muniId) {
        this.muniId = muniId;
    }

    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
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

        Cities cities = (Cities) o;

        if (id != cities.id) return false;
        if (placeId != cities.placeId) return false;
        if (countryId != cities.countryId) return false;
        if (name != null ? !name.equals(cities.name) : cities.name != null) return false;
        if (key != null ? !key.equals(cities.key) : cities.key != null) return false;
        if (code != null ? !code.equals(cities.code) : cities.code != null) return false;
        if (altNames != null ? !altNames.equals(cities.altNames) : cities.altNames != null) return false;
        if (stateId != null ? !stateId.equals(cities.stateId) : cities.stateId != null) return false;
        if (partId != null ? !partId.equals(cities.partId) : cities.partId != null) return false;
        if (countyId != null ? !countyId.equals(cities.countyId) : cities.countyId != null) return false;
        if (muniId != null ? !muniId.equals(cities.muniId) : cities.muniId != null) return false;
        if (metroId != null ? !metroId.equals(cities.metroId) : cities.metroId != null) return false;
        if (pop != null ? !pop.equals(cities.pop) : cities.pop != null) return false;
        if (area != null ? !area.equals(cities.area) : cities.area != null) return false;
        if (createdAt != null ? !createdAt.equals(cities.createdAt) : cities.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cities.updatedAt) : cities.updatedAt != null) return false;

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
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (partId != null ? partId.hashCode() : 0);
        result = 31 * result + (countyId != null ? countyId.hashCode() : 0);
        result = 31 * result + (muniId != null ? muniId.hashCode() : 0);
        result = 31 * result + (metroId != null ? metroId.hashCode() : 0);
        result = 31 * result + (pop != null ? pop.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
