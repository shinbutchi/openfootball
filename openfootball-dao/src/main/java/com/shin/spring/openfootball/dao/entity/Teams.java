package com.shin.spring.openfootball.dao.entity;

public class Teams {
    private int id;
    private String key;
    private String title;
    private String title2;
    private String code;
    private String synonyms;
    private int countryId;
    private Integer cityId;
    private int club;
    private Integer since;
    private String address;
    private String web;
    private Integer assocId;
    private int national;
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

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public Integer getSince() {
        return since;
    }

    public void setSince(Integer since) {
        this.since = since;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Integer getAssocId() {
        return assocId;
    }

    public void setAssocId(Integer assocId) {
        this.assocId = assocId;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
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

        Teams teams = (Teams) o;

        if (id != teams.id) return false;
        if (countryId != teams.countryId) return false;
        if (club != teams.club) return false;
        if (national != teams.national) return false;
        if (key != null ? !key.equals(teams.key) : teams.key != null) return false;
        if (title != null ? !title.equals(teams.title) : teams.title != null) return false;
        if (title2 != null ? !title2.equals(teams.title2) : teams.title2 != null) return false;
        if (code != null ? !code.equals(teams.code) : teams.code != null) return false;
        if (synonyms != null ? !synonyms.equals(teams.synonyms) : teams.synonyms != null) return false;
        if (cityId != null ? !cityId.equals(teams.cityId) : teams.cityId != null) return false;
        if (since != null ? !since.equals(teams.since) : teams.since != null) return false;
        if (address != null ? !address.equals(teams.address) : teams.address != null) return false;
        if (web != null ? !web.equals(teams.web) : teams.web != null) return false;
        if (assocId != null ? !assocId.equals(teams.assocId) : teams.assocId != null) return false;
        if (createdAt != null ? !createdAt.equals(teams.createdAt) : teams.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(teams.updatedAt) : teams.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (title2 != null ? title2.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (synonyms != null ? synonyms.hashCode() : 0);
        result = 31 * result + countryId;
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + club;
        result = 31 * result + (since != null ? since.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (assocId != null ? assocId.hashCode() : 0);
        result = 31 * result + national;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
