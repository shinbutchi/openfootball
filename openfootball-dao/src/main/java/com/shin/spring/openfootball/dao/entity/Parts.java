package com.shin.spring.openfootball.dao.entity;

public class Parts {
    private int id;
    private String name;
    private String key;
    private int placeId;
    private String code;
    private String abbr;
    private String iso;
    private String nuts;
    private String altNames;
    private int stateId;
    private int level;
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

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

        Parts parts = (Parts) o;

        if (id != parts.id) return false;
        if (placeId != parts.placeId) return false;
        if (stateId != parts.stateId) return false;
        if (level != parts.level) return false;
        if (name != null ? !name.equals(parts.name) : parts.name != null) return false;
        if (key != null ? !key.equals(parts.key) : parts.key != null) return false;
        if (code != null ? !code.equals(parts.code) : parts.code != null) return false;
        if (abbr != null ? !abbr.equals(parts.abbr) : parts.abbr != null) return false;
        if (iso != null ? !iso.equals(parts.iso) : parts.iso != null) return false;
        if (nuts != null ? !nuts.equals(parts.nuts) : parts.nuts != null) return false;
        if (altNames != null ? !altNames.equals(parts.altNames) : parts.altNames != null) return false;
        if (pop != null ? !pop.equals(parts.pop) : parts.pop != null) return false;
        if (area != null ? !area.equals(parts.area) : parts.area != null) return false;
        if (createdAt != null ? !createdAt.equals(parts.createdAt) : parts.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(parts.updatedAt) : parts.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + placeId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (abbr != null ? abbr.hashCode() : 0);
        result = 31 * result + (iso != null ? iso.hashCode() : 0);
        result = 31 * result + (nuts != null ? nuts.hashCode() : 0);
        result = 31 * result + (altNames != null ? altNames.hashCode() : 0);
        result = 31 * result + stateId;
        result = 31 * result + level;
        result = 31 * result + (pop != null ? pop.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
