package com.shin.spring.openfootball.dao.entity;

public class Persons {
    private int id;
    private String key;
    private String name;
    private String synonyms;
    private String code;
    private String bornAt;
    private Integer cityId;
    private Integer stateId;
    private Integer countryId;
    private Integer nationalityId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBornAt() {
        return bornAt;
    }

    public void setBornAt(String bornAt) {
        this.bornAt = bornAt;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
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

        Persons persons = (Persons) o;

        if (id != persons.id) return false;
        if (key != null ? !key.equals(persons.key) : persons.key != null) return false;
        if (name != null ? !name.equals(persons.name) : persons.name != null) return false;
        if (synonyms != null ? !synonyms.equals(persons.synonyms) : persons.synonyms != null) return false;
        if (code != null ? !code.equals(persons.code) : persons.code != null) return false;
        if (bornAt != null ? !bornAt.equals(persons.bornAt) : persons.bornAt != null) return false;
        if (cityId != null ? !cityId.equals(persons.cityId) : persons.cityId != null) return false;
        if (stateId != null ? !stateId.equals(persons.stateId) : persons.stateId != null) return false;
        if (countryId != null ? !countryId.equals(persons.countryId) : persons.countryId != null) return false;
        if (nationalityId != null ? !nationalityId.equals(persons.nationalityId) : persons.nationalityId != null)
            return false;
        if (createdAt != null ? !createdAt.equals(persons.createdAt) : persons.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(persons.updatedAt) : persons.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (synonyms != null ? synonyms.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (bornAt != null ? bornAt.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (nationalityId != null ? nationalityId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
