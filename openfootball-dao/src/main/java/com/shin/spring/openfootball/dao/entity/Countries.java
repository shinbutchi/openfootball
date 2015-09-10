package com.shin.spring.openfootball.dao.entity;

public class Countries {
    private int id;
    private String name;
    private String slug;
    private String key;
    private int placeId;
    private String code;
    private String altNames;
    private String histNames;
    private int pop;
    private int area;
    private Integer continentId;
    private Integer countryId;
    private int s;
    private int c;
    private int d;
    private int m;
    private String motor;
    private String alpha2;
    private String alpha3;
    private String num;
    private String fifa;
    private String ioc;
    private String fips;
    private String net;
    private String wikipedia;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getHistNames() {
        return histNames;
    }

    public void setHistNames(String histNames) {
        this.histNames = histNames;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Integer getContinentId() {
        return continentId;
    }

    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public String getIoc() {
        return ioc;
    }

    public void setIoc(String ioc) {
        this.ioc = ioc;
    }

    public String getFips() {
        return fips;
    }

    public void setFips(String fips) {
        this.fips = fips;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
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

        Countries countries = (Countries) o;

        if (id != countries.id) return false;
        if (placeId != countries.placeId) return false;
        if (pop != countries.pop) return false;
        if (area != countries.area) return false;
        if (s != countries.s) return false;
        if (c != countries.c) return false;
        if (d != countries.d) return false;
        if (m != countries.m) return false;
        if (name != null ? !name.equals(countries.name) : countries.name != null) return false;
        if (slug != null ? !slug.equals(countries.slug) : countries.slug != null) return false;
        if (key != null ? !key.equals(countries.key) : countries.key != null) return false;
        if (code != null ? !code.equals(countries.code) : countries.code != null) return false;
        if (altNames != null ? !altNames.equals(countries.altNames) : countries.altNames != null) return false;
        if (histNames != null ? !histNames.equals(countries.histNames) : countries.histNames != null) return false;
        if (continentId != null ? !continentId.equals(countries.continentId) : countries.continentId != null)
            return false;
        if (countryId != null ? !countryId.equals(countries.countryId) : countries.countryId != null) return false;
        if (motor != null ? !motor.equals(countries.motor) : countries.motor != null) return false;
        if (alpha2 != null ? !alpha2.equals(countries.alpha2) : countries.alpha2 != null) return false;
        if (alpha3 != null ? !alpha3.equals(countries.alpha3) : countries.alpha3 != null) return false;
        if (num != null ? !num.equals(countries.num) : countries.num != null) return false;
        if (fifa != null ? !fifa.equals(countries.fifa) : countries.fifa != null) return false;
        if (ioc != null ? !ioc.equals(countries.ioc) : countries.ioc != null) return false;
        if (fips != null ? !fips.equals(countries.fips) : countries.fips != null) return false;
        if (net != null ? !net.equals(countries.net) : countries.net != null) return false;
        if (wikipedia != null ? !wikipedia.equals(countries.wikipedia) : countries.wikipedia != null) return false;
        if (createdAt != null ? !createdAt.equals(countries.createdAt) : countries.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(countries.updatedAt) : countries.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + placeId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (altNames != null ? altNames.hashCode() : 0);
        result = 31 * result + (histNames != null ? histNames.hashCode() : 0);
        result = 31 * result + pop;
        result = 31 * result + area;
        result = 31 * result + (continentId != null ? continentId.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + s;
        result = 31 * result + c;
        result = 31 * result + d;
        result = 31 * result + m;
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + (alpha2 != null ? alpha2.hashCode() : 0);
        result = 31 * result + (alpha3 != null ? alpha3.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (fifa != null ? fifa.hashCode() : 0);
        result = 31 * result + (ioc != null ? ioc.hashCode() : 0);
        result = 31 * result + (fips != null ? fips.hashCode() : 0);
        result = 31 * result + (net != null ? net.hashCode() : 0);
        result = 31 * result + (wikipedia != null ? wikipedia.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
