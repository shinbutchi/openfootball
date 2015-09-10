package com.shin.spring.openfootball.dao.entity;

public class States {
    private int id;
    private String name;
    private String key;
    private int placeId;
    private String code;
    private String abbr;
    private String iso;
    private String nuts;
    private String altNames;
    private int countryId;
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

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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

        States states = (States) o;

        if (id != states.id) return false;
        if (placeId != states.placeId) return false;
        if (countryId != states.countryId) return false;
        if (level != states.level) return false;
        if (name != null ? !name.equals(states.name) : states.name != null) return false;
        if (key != null ? !key.equals(states.key) : states.key != null) return false;
        if (code != null ? !code.equals(states.code) : states.code != null) return false;
        if (abbr != null ? !abbr.equals(states.abbr) : states.abbr != null) return false;
        if (iso != null ? !iso.equals(states.iso) : states.iso != null) return false;
        if (nuts != null ? !nuts.equals(states.nuts) : states.nuts != null) return false;
        if (altNames != null ? !altNames.equals(states.altNames) : states.altNames != null) return false;
        if (pop != null ? !pop.equals(states.pop) : states.pop != null) return false;
        if (area != null ? !area.equals(states.area) : states.area != null) return false;
        if (createdAt != null ? !createdAt.equals(states.createdAt) : states.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(states.updatedAt) : states.updatedAt != null) return false;

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
        result = 31 * result + countryId;
        result = 31 * result + level;
        result = 31 * result + (pop != null ? pop.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
